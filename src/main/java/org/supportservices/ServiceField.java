package org.supportservices;

import java.util.Objects;

public class ServiceField {
    private int id;
    private static int nextId = 1;
    private String value;

    public ServiceField(){
        id = nextId;
        nextId++;
    }

    public ServiceField(String value){
        this();
        this.value = value;
    }


    @Override
    public String toString(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceField)) return false;
        ServiceField that = (ServiceField) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId(){
        return id;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
}


