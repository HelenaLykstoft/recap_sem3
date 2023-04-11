/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.HobbyDTO;
import dtos.PersonDTO;
import dtos.RenameMeDTO;
import entities.Hobby;
import entities.Person;
import entities.RenameMe;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        PersonFacade pf = PersonFacade.getPersonFacade(emf);

        PersonDTO personDTO1 = new PersonDTO(new Person("Kenny", 10));
        personDTO1 = pf.createPerson(personDTO1);

        HobbyDTO hobbyDTO1 = new HobbyDTO(new Hobby("FOOD", "Food hobby eating"));
        hobbyDTO1 = pf.createHobby(hobbyDTO1);

        pf.addHobby(personDTO1.getId(), hobbyDTO1.getId());

        pf.removeHobbyFromPerson(personDTO1.getId(), hobbyDTO1.getId());
    }
    
    public static void main(String[] args) {
        populate();
    }
}
