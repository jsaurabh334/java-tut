import java.io.File;

public class Filedemo {
    public static void main(String[] args) {
        try {
            File file = new File("kdx.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (java.io.IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
