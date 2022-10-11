package ph.homecredit.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import ph.homecredit.exam.entity.Person;
import ph.homecredit.exam.repository.*;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> listPersons() {
        List<Person> persons = new ArrayList<Person>();  
        personRepository.findAll().forEach(person -> persons.add(person));;
        return persons;
    }

    /**
     * This should insert to an h2 database
     *
     * @param person person object to create
     * @return created person
     */
    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    /**
     * This should update an existing entity on an h2 database
     *
     * @param id person's id on the database
     * @param person updated person object to update the entity on the database
     * @return updated person
     */
    @Override
    public Person updatePerson(Long id, Person person) {
        person.setId(id);
        Person _person = personRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found")
            );

        _person.setFirstName(
            person.getFirstName()
        );
        _person.setMiddleName(
            person.getMiddleName()
        );
        _person.setLastName(
            person.getLastName()
        );
        _person.setAge((
            person.getAge()
        ));
        _person.setEmail(
            person.getEmail()
        );

        return personRepository.save(person);
    }

    /**
     * @param id person's id on the database
     * @return person's id on the database
     */
    @Override
    public Long deletePerson(Long id) {
        Person _person = personRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found")
            );
        personRepository.delete(_person);

        return id;
    }

}
