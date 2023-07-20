package com.example.postmantutorial.services;

import com.example.postmantutorial.dtos.PersonDTO;

import java.util.List;

public interface PersonService {
    void savePerson(List<PersonDTO> dto);
}
