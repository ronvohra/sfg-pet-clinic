package io.github.ronvohra.sfgpetclinic.model;

public class PetType {
    private String name;

    public PetType(String name) {
        this.name = name;
    }

    public PetType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
