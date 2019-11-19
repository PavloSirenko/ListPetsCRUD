package com.psi.service;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {
    @JsonProperty("id")
    private int id;
    private static int counter = 1;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Age")
    private String age;

    public Pet() {
        this.id = counter++;
    }

    public Pet(String type, String name, String age) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[Pet {id: " + id + ", type: " + type + ", name: " + name + ", age: " + age + "}]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id &&
                Objects.equals(type, pet.type) &&
                Objects.equals(name, pet.name) &&
                Objects.equals(age, pet.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, age);
    }
}
