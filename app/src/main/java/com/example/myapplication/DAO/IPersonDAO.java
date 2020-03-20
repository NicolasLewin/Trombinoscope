package com.example.myapplication.DAO;

import com.example.myapplication.DTO.Person;

import java.util.List;

public interface IPersonDAO {
    public List<Person> getPersons();

    public void addPerson(Person person);

    public void removePerson(Person person);
}
