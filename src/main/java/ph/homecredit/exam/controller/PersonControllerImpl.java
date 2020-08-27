package ph.homecredit.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ph.homecredit.exam.entity.Person;
import ph.homecredit.exam.service.PersonService;

public class PersonControllerImpl implements PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    @Override
    public Person createPerson(Person person) {
        return personService.createPerson(person);
    }

    @PostMapping("/persons")
    @Override
    public Person updatePerson(@PathVariable("id") Long id, Person person) {
        return personService.updatePerson(id, person);
    }

    @PostMapping("/persons")
    @Override
    public Long deletePerson(Long id) {
        return personService.deletePerson(id);
    }

}
