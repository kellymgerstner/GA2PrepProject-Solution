package org.supportservices;

import java.util.Objects;

public class Service {
    //TODO: Declare fields
    private int id;
    private static int nextId = 1;

    private String name;
    private Provider provider;
    private Category category;
    private Location location;

    //TODO: Add constructors
    public Service(){
        this.id = nextId;
        nextId++;
    }

    public Service(String name, Provider provider, Category category, Location location){
        this();
        this.name = name;
        this.provider = provider;
        this.category = category;
        this.location = location;
    }

    //TODO: Add necessary getters and setters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Provider getProvider(){
        return provider;
    }
    public void setProvider(Provider provider){this.provider = provider;}

    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){this.category = category;}

    public Location getLocation(){return location;}
    public void setLocation(Location location){this.location = location;}

    //TODO: Override toString, Equals, and HashCode methods

    @Override
    public String toString(){
        String output = "";

        if(name == ""){
            name = "Data not available";
        }
        if(provider.getValue() == "" || provider.getValue() == null){
            provider.setValue("Data is not available.");
        }
        if(category.getValue() == "" || category.getValue() == null){
            category.setValue("Data is not available.");
        }
        if(location.getValue() == "" || location.getValue() == null){
            location.setValue("Data is not available.");
        }

        output = "**********" +
                "\nName: " + name +
                "\nProvider: " + provider +
                "\nCategory: " + category +
                "\nLocation: " + location +
                "\n**********";
        return output;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service)) return false;
        Service service = (Service) o;
        return getId() == service.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}



