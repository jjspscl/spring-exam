package ph.homecredit.exam.service;

import ph.homecredit.exam.entity.Person;

public interface PersonService {

    Person createPerson(Person person);

    Person updatePerson(Long id, Person person);

    Long deletePerson(Long id);

}
