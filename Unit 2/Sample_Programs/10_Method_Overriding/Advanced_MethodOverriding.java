package sample_programs.method_overriding;

class SuperType {}
class SubType extends SuperType {}

class Base {
    SuperType get() { return new SuperType(); }
}

class Derived extends Base {
    // Covariant return type (returns subclass of parent method return type)
    @Override
    SubType get() { return new SubType(); }
}

/**
 * AIM: Demonstrate Covariant Return Types in method overriding (Advanced).
 */
public class Advanced_MethodOverriding {
    public static void main(String[] args) {
        Base obj = new Derived();
        System.out.println("Return type instance: " + obj.get().getClass().getSimpleName());
    }
}
