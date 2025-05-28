import accessmodifier.pack1.Access1;
import accessmodifier.pack2.Access2;
public class MainAccess {
    public static void main(String[] args) {
        Access1 obj = new Access1();
        System.out.println("Access1 (non-subclass):");
        System.out.println("publicVar = " + obj.publicVar);     // OK
        // System.out.println("protectedVar = " + obj.protectedVar); // Not accessible via object from different package
        // System.out.println("defaultVar = " + obj.defaultVar);     // Not accessible
        // System.out.println("privateVar = " + obj.privateVar);     // Not accessible
        System.out.println();
        Access2 sub = new Access2();
        sub.display();
    }
}
