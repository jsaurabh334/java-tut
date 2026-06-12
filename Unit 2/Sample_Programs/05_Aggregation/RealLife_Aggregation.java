package sample_programs.aggregation;

import java.util.ArrayList;
import java.util.List;

class Tyre {
    String brand;
    Tyre(String brand) { this.brand = brand; }
}

class RaceCar {
    private String team;
    private List<Tyre> tyres = new ArrayList<>(); // Aggregation

    RaceCar(String team) { this.team = team; }
    
    void mountTyre(Tyre t) {
        if (tyres.size() < 4) {
            tyres.add(t);
        }
    }
    
    void showSetup() {
        System.out.println("Team: " + team + ", Tyres mounted: " + tyres.size());
    }
}

/**
 * AIM: Model real-world racecar tire changes using aggregation.
 */
public class RealLife_Aggregation {
    public static void main(String[] args) {
        Tyre wetTyre = new Tyre("Pirelli Wet");
        RaceCar car = new RaceCar("Ferrari");
        car.mountTyre(wetTyre);
        car.showSetup();
    }
}
