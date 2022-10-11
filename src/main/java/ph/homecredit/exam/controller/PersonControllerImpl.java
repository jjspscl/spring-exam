package ph.homecredit.exam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.homecredit.exam.entity.Person;
import ph.homecredit.exam.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonControllerImpl implements PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> listPersons() {
        return personService.listPersons();
    }
    
    @PostMapping
    public Person createPerson(@Valid @RequestBody Person person) {
        return personService.createPerson(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable("id") Long id, @Valid @RequestBody Person person) {
        return personService.updatePerson(id, person);
    }

    @DeleteMapping("/{id}")
    public Long deletePerson(@PathVariable("id") Long id) {
        return personService.deletePerson(id);
    }

}
