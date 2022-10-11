package ph.homecredit.exam.controller;

import java.util.List;

import ph.homecredit.exam.entity.Person;

public interface PersonController {

    Person createPerson(Person person);
    
    List<Person> listPersons();

    Person updatePerson(Long id, Person person);

    Long deletePerson(Long id);

}
