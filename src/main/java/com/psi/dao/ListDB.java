package com.psi.dao;

import com.psi.service.Pet;

import java.util.ArrayList;
import java.util.List;

public class ListDB {
    private static ListDB instance = new ListDB();
    private static List<Pet> petList;

    public static ListDB getInstance() {
        return instance;
    }

    private ListDB() {
        petList = new ArrayList<>();
    }

    public static void add(Pet pet) {
        petList.add(pet);
    }

    public static void update(int id, Pet pet) {
        petList.set(id, pet);
    }

    public static void delete(int id) {
        petList.remove(id);
    }

    public static List<Pet> list() {
        return petList;
    }

    public static Pet getPet(int id) {
        return petList.get(id);
    }
}
