package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        if (getValue().equals ("")) {
            return ("Data not Available");
        } else {
            return getValue();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;

        JobField jobField = (JobField) o;

        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
