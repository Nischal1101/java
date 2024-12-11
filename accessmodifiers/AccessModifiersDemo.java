package accessmodifiers;

public class AccessModifiersDemo {
    // Public variable - accessible everywhere
    public String publicVar = "I am public";

    // Private variable - accessible only within this class
    private String privateVar = "I am private";

    // Protected variable - accessible within package and subclasses
    protected String protectedVar = "I am protected";

    // Default (package-private) variable - accessible within the package
    String defaultVar = "I am default (package-private)";

    // Getter for private variable
    public String getPrivateVar() {
        return privateVar;
    }

    // Getter for protected variable (to show access outside the package)
    public String getProtectedVar() {
        return protectedVar;
    }
}
