package model.RegisterBuilder;

import model.Register;
import org.apache.commons.lang3.builder.Builder;


public class RegisterBuilder implements Builder<Register> {

    private String name;

    public RegisterBuilder(String name) {
        this.name = name;
    }

    public static RegisterBuilder name(String name){
        return new RegisterBuilder(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public Register build() {
        return new Register(this);
    }
}
