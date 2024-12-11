package accessmodifiersanother;
import accessmodifiers.AccessModifiersDemo;

public class SubclassDemo extends AccessModifiersDemo {
    public void accessProtectedVar() {
        System.out.println("Protected Variable in Subclass: " + protectedVar);
    }
}
