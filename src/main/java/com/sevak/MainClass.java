package com.sevak;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args)  {
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("+374_00_00_00_00");
        phoneNumber.add("+374_00_00_00_01");

        Person person = new Person("Sevak", "Tovmasyan", phoneNumber, new Car("Kamaz", "BLack"));
        //Serialize
        String xml = "No result";
        XmlMapper mapper = new XmlMapper();
        try {
             xml = mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("XML Format");
        System.out.println(xml);
        //DeSerialize
        Person newPerson = null;
        String XML = xml;
        try {
            newPerson = mapper.readValue(xml, Person.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialize XML");
        System.out.println(newPerson);
    }
}
