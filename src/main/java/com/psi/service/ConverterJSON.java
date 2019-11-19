package com.psi.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterJSON {
    private final static String baseFile = "pet.json";

    public static void toJSON(Pet pet) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), pet);
        System.out.println("json created!");
    }

    public static Pet toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), Pet.class);
    }
}
