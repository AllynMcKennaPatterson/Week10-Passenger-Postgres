package ie.atu.Passenger_Springboot_Lab;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Allyn", 1786367, 378723498, 21),
                new Passenger("Ms", "Allyn", 5347832, 353245564, 25),
                new Passenger("Mr", "Allyn", 5642326, 346324432, 15));

        return myPassengers;
    }

    public Passenger getPassenger(long passengerID){
        Passenger myPassenger = new Passenger("Mr", "Allyn", 1786367, 378723498, 21);
        return myPassenger;
    }
}
