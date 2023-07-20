package com.example.postmantutorial;

import com.example.postmantutorial.dtos.PersonDTO;
import com.example.postmantutorial.entities.Person;
import com.example.postmantutorial.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping("/PostPerson")
    void postBody(@RequestBody List<PersonDTO> dtos) {
        personService.savePerson(dtos);
    }
    @DeleteMapping ("/DeletePerson")
    void deleteBody(@RequestBody List<PersonDTO> dtos) {
        personService.deletePerson(dtos);
    }

}