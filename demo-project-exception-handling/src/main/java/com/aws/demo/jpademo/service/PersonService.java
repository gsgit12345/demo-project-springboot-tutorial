package com.aws.demo.jpademo.service;

import com.aws.demo.jpademo.pojo.Person;
import com.aws.demo.jpademo.repository.CrudeRepositoryImpl;
import com.aws.demo.jpademo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PersonService {
    @Autowired
    private CrudeRepositoryImpl repository;

    public Person savePerson(Person person) {
      Person p= repository.savePerson(person);
      return  p;
    }
}
