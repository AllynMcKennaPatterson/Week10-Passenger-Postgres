package ie.atu.Passenger_Springboot_Lab;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(long passengerID){
        Passenger myPassenger = new Passenger("Mr", "Allyn", 1786367, 378723498, 21);
        return myPassenger;
    }
}
