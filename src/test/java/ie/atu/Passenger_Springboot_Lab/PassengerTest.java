package ie.atu.Passenger_Springboot_Lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    private Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "John Doe", 1234334567891L, 1233456789, 42);
    }

    @Test
    void testTitlePass(){
        assertEquals("Mr", myPassenger.getPassengerTitle());
        myPassenger.setPassengerTitle("Ms");
        assertEquals("Ms", myPassenger.getPassengerTitle());
        myPassenger.setPassengerTitle("Mrs");
        assertEquals("Mrs", myPassenger.getPassengerTitle());

    }

    @Test
    void testNamePass(){
        assertEquals("John Doe", myPassenger.getPassengerName());
    }

    @Test
    void testIdPass(){
        assertEquals(1234334567891L, myPassenger.getPassengerId());
    }

    @Test
    void testPhonePass(){
        assertEquals(1233456789, myPassenger.getPassengerPhone());
    }

    @Test
    void testAgePass(){
        assertEquals(42, myPassenger.getPassengerAge());
    }

}

