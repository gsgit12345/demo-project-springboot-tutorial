package com.aws.demo.jpademo.repository;

import com.aws.demo.jpademo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CrudeRepositoryImpl {
    @Autowired private PersonRepository repository;
    public Person savePerson(Person person)
    {
      return  repository.save(person);
    }
}
