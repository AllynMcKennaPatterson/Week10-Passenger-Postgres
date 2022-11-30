package ie.atu.Passenger_Springboot_Lab;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo  extends JpaRepository<Passenger, Long> {
}
