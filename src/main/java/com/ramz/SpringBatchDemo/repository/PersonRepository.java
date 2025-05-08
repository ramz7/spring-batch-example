package com.ramz.SpringBatchDemo.repository;

import com.ramz.SpringBatchDemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// this Repository is used in order to save data in a table(Person)
public interface PersonRepository extends JpaRepository<Person, Long> {
}
