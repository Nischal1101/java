package accessmodifiers;
public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        
        // Accessing public variable
        System.out.println("Public Variable: " + demo.publicVar);
        
        // Accessing protected variable
        System.out.println("Protected Variable: " + demo.getProtectedVar());
        
        // Accessing default variable
        System.out.println("Default Variable: " + demo.defaultVar);
        
        // Accessing private variable (via getter, direct access is not allowed)
        System.out.println("Private Variable (via getter): " + demo.getPrivateVar());
    }
}
