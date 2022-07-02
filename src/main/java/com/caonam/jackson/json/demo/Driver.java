package com.caonam.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            //create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map to Java POJO sample_lite.json
            //Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
            // read JSON file and map to Java POJO sample_full.json
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
            // print
            System.out.println("First name: " + theStudent.getFirstName()
                    + "\nLast name: " + theStudent.getLastName());

            Address tempAddress = theStudent.getAddress();
            System.out.println("Street: " + tempAddress.getStreet()
                    + "\nCity: " + tempAddress.getCity()
//                    + "\nState: " + tempAddress.getState()
//                    + "\nZip: " + tempAddress.getZip()
//                    + "\nCountry: " + tempAddress.getCountry()
                        );

            for (String tempLang : theStudent.getLanguages() ){
                System.out.println(tempLang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
