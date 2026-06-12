package sample_programs.composition;

class Heart {
    private boolean beating = true;
    void stop() { beating = false; }
    boolean isBeating() { return beating; }
}

class Human {
    private Heart heart; // Composition

    Human() {
        this.heart = new Heart();
    }

    void die() {
        heart.stop();
        System.out.println("Human died. Heart beating: " + heart.isBeating());
        heart = null; // Destroyed
    }
}

/**
 * AIM: Demonstrate lifecycle dependency where child is destroyed with parent (Advanced).
 */
public class Advanced_Composition {
    public static void main(String[] args) {
        Human person = new Human();
        person.die();
    }
}
