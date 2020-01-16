package org.launchcode.techjobs_oo;

public abstract class JobField {
    public int id;
    private static int nextId = 1;
    public String value;

    public JobField () {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }

   public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return value;
    }

   public String getValue() {
        return value;
    }
}
