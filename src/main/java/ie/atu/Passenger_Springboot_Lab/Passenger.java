package ie.atu.Passenger_Springboot_Lab;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Passenger {
    private String passengerTitle;
    private String passengerName;
    private long passengerId;
    private long passengerPhone;
    private int passengerAge;

    public String getPassengerTitle() {
        return passengerTitle;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public long getPassengerPhone() {
        return passengerPhone;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerTitle(String passengerTitle) {
        if("Mr".equalsIgnoreCase(passengerTitle) || "Ms".equalsIgnoreCase(passengerTitle)|| "Ms".equalsIgnoreCase(passengerTitle)) {
            this.passengerTitle = passengerTitle;
        }
        else{
            throw new IllegalArgumentException("This is not a valid title. Use Mr, Ms, or Mrs");
        }
    }

    public void setPassengerName(String passengerName) {
        if(passengerName.length() >= 3){
            this.passengerName = passengerName;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name.");
        }
    }

    public void setPassengerId(long passengerId) {
        if(String.valueOf(passengerId).length() >= 10){
            this.passengerId = passengerId;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID.");
        }
    }

    public void setPassengerPhone(long passengerPhone) {
        if(String.valueOf(passengerPhone).length() >= 7){
            this.passengerPhone = passengerPhone;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number.");
        }
    }

    public void setPassengerAge(int passengerAge) {
        if(passengerAge > 16){
            this.passengerAge = passengerAge;
        }
        else{
            throw new IllegalArgumentException("You must be over 16.");
        }
    }
}
