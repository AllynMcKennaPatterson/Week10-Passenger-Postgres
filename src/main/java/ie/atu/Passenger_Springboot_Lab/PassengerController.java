package ie.atu.Passenger_Springboot_Lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerController {

	PassengerService myService;

	public PassengerController(PassengerService myService) {
		this.myService = myService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerController.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
		return myService.getPassengers();
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable long passengerID){
		return myService.getPassenger(passengerID);
	}
}
