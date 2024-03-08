package develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.services;

import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.entities.Flight;
import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.entities.FlightStatus;
import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    private String generateRandomString() {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char randomChar = alphabet.charAt(random.nextInt(alphabet.length()));
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }
    public void generateRandomFlights() {
        List<Flight> flightList = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            Flight randomFlight = new Flight();
            randomFlight.setDescription(generateRandomString());
            randomFlight.setFromAirport(generateRandomString());
            randomFlight.setToAirport(generateRandomString());
            randomFlight.setStatus(FlightStatus.ONTIME);
            flightList.add(randomFlight);
        }
        flightRepository.saveAll(flightList);
    }
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }
}
