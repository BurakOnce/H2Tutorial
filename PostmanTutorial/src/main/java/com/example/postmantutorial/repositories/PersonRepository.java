package com.example.postmantutorial.repositories;

import com.example.postmantutorial.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
