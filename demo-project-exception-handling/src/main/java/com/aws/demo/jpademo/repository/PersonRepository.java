package com.aws.demo.jpademo.repository;

import com.aws.demo.jpademo.pojo.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository  extends CrudRepository<Person,Integer> {
}
