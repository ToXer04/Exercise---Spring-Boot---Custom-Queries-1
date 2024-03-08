package develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.controllers;

import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.entities.Flight;
import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @PostMapping("/provision")
    public void provision() {
        flightService.generateRandomFlights();
    }

    @GetMapping("/get-all")
    public List<Flight> getAll(){
        return flightService.findAll();
    }
}
