package ph.homecredit.exam.service;

import java.util.List;

import ph.homecredit.exam.entity.Person;

public interface PersonService {

    Person createPerson(Person person);

    List<Person> listPersons();

    Person updatePerson(Long id, Person person);

    Long deletePerson(Long id);

}
