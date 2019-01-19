package com.company;

public final class ImmutableExample {

    private String name;

    ImmutableExample (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
