package model;

import model.RegisterBuilder.RegisterBuilder;

public class Register {

    private final String name;


    public Register(RegisterBuilder builder) {
        this.name = builder.getName();
    }

    public String getName() {
        return name;
    }
}
