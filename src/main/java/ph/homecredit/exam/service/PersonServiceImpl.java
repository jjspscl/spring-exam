package ph.homecredit.exam.service;

import ph.homecredit.exam.entity.Person;

public class PersonServiceImpl implements PersonService {

    /**
     * This should insert to an h2 database
     *
     * @param person person object to create
     * @return created person
     */
    @Override
    public Person createPerson(Person person) {
        return person;
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
        return person;
    }

    /**
     * @param id person's id on the database
     * @return person's id on the database
     */
    @Override
    public Long deletePerson(Long id) {
        return null;
    }

}
