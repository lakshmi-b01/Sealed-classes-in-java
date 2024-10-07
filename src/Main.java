// Class A is sealed and only permits B
sealed class A permits B, E{

}

// B extends A and is non-sealed - permits any other class to inherit
non-sealed class B extends A{

}

// C can extend B without being a sealed/non-sealed/final since it is extending a non-sealed class
class C extends B{

}

// This class cannot be extended
final class D{

}

// Extending a sealed class, but this class cannot be further extended since it is final.
final class E extends A{

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}