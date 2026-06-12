package sample_programs.package_concepts;

class UtilityHelper {
    static void printSystemLog(String log) {
        System.out.println("[API Log]: " + log);
    }
}

/**
 * AIM: Model real-world encapsulated package utility helper calls.
 */
public class RealLife_PackageConcepts {
    public static void main(String[] args) {
        UtilityHelper.printSystemLog("Network Connection Established.");
    }
}
