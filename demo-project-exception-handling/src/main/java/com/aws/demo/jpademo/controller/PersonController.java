package com.aws.demo.jpademo.controller;

import com.aws.demo.jpademo.pojo.Person;
import com.aws.demo.jpademo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<String> person(@RequestBody Person person) {
        Person p = personService.savePerson(person);
        if (p.getId() != 0) {
            return ResponseEntity.ok().body("student is saved with ID" + person.getId());
        } else {
            return ResponseEntity.ok().body("student is savednot  with ID" + person.getId());

        }
    }
}
