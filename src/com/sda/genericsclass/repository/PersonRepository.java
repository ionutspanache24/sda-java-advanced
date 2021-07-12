package com.sda.genericsclass.repository;

import com.sda.genericsclass.model.Person;

public class PersonRepository extends IdentifiableRepository<Person> {

    public Person getPersonByName(String name) {
        for (Person person : items) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
