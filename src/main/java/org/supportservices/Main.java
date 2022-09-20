package org.supportservices;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service1 = new Service("Food Pantry", new Provider("Salvation Army"), new Category("Food Assistance"), new Location("St. Louis"));
        Service service2 = new Service("Group Counseling", new Provider("NAMI"), new Category("Mental Health"), new Location("Online"));
        Service service3 = new Service("Women's Shelter", new Provider("United Way"), new Category("Housing Assistance"), new Location ("St. Charles"));

        ArrayList<Service> allServices = new ArrayList<>();
        allServices.add(service1);
        allServices.add(service2);
        allServices.add(service3);

        for(Service service : allServices){
            System.out.println(service);
        }

    }
}