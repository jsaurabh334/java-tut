package sample_programs.composition;

import java.util.ArrayList;
import java.util.List;

class Room {
    String name;
    Room(String name) { this.name = name; }
}

class House {
    private List<Room> rooms;

    House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Living Room"));
    }

    void showRooms() {
        for (Room r : rooms) {
            System.out.println("Room: " + r.name);
        }
    }
}

/**
 * AIM: Demonstrate House-Room composition (Intermediate).
 */
public class Intermediate_Composition {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
