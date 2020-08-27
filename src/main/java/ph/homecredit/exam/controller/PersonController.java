package ph.homecredit.exam.controller;

import ph.homecredit.exam.entity.Person;

public interface PersonController {

    Person createPerson(Person person);

    Person updatePerson(Long id, Person person);

    Long deletePerson(Long id);

}
