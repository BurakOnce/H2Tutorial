package com.example.postmantutorial.services;

import com.example.postmantutorial.dtos.PersonDTO;
import com.example.postmantutorial.entities.Person;
import com.example.postmantutorial.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;


    @Override
    public void savePerson(List<PersonDTO> dtos) {
        for (PersonDTO dto:dtos){
            Person person = new Person();
            person.setName(dto.getName());
            person.setAge(dto.getAge());
            repository.save(person);
        }

    }


    public void deletePerson(List<PersonDTO> dtos) {
        for (PersonDTO dto:dtos){
            Person person = new Person();
            person.setName(dto.getName());
            person.setAge(dto.getAge());
            repository.delete(person);
        }

    }
}
