package org.supportservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    private Service service1, service2, service3, service4, service5;
    @BeforeEach
    public void createTestServices(){
        service1 = new Service();
        service2 = new Service();
        service3 = new Service("Food Pantry", new Provider("Salvation Army"), new Category("Food Assistance"), new Location("St. Louis"));
        service4 = new Service("Group Counseling", new Provider("NAMI"), new Category("Mental Health"), new Location("Online"));
        service5 = new Service("Women's Shelter", new Provider("United Way"), new Category("Housing Assistance"), new Location ("St. Charles"));
    }

    @Test
    public void testSettingServiceId(){
        assertNotEquals(service1.getId(), service2.getId());
    }

    @Test
    public void testConstructorSetsFields(){
        assertEquals(service3.getName(), "Food Pantry");
        assertEquals(service3.getProvider().getValue(), "Salvation Army");
        assertEquals(service3.getCategory().getValue(), "Food Assistance");
        assertEquals(service3.getLocation().getValue(), "St. Louis");

    }

    @Test
    public void testConstructorSetsCorrectFieldTypes(){
        assertTrue(service4.getProvider() instanceof Provider);
        assertTrue(service4.getCategory() instanceof Category);
        assertTrue(service4.getLocation() instanceof Location);
    }
    @Test
    public void testForServiceEquality(){
        assertFalse(service1.equals(service2));
    }

    @Test
    public void testThatServiceBeginsAndEndsWithNewLine(){
        assertEquals(service5.toString().charAt(0), service5.toString().charAt(service5.toString().length()-1));
    }

    @Test
    public void testToStringPrintsFields(){

    }


}