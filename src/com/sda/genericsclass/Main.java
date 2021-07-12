package com.sda.genericsclass;

import com.sda.genericsclass.model.Person;
import com.sda.genericsclass.repository.IdentifiableRepository;

public class Main {

    public static void main(String[] args) {

        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();
        person.setCNP("2953245611132");
        person.setName("Richard");
        personRepository.addItem(person);
        System.out.println(personRepository.getItemById("23"));
        System.out.println(personRepository.getItemById("2953245611132"));
        personRepository.removeItemById("2953245611132");
        System.out.println(personRepository.getItemById("2953245611132"));
    }
}
