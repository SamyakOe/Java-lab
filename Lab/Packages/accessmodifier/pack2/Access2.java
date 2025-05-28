package accessmodifier.pack2;
import accessmodifier.pack1.Access1;
public class Access2 extends Access1 {
    public void display() {
        System.out.println("Access2 (extends Access1):");
        System.out.println("publicVar = " + publicVar);      
        System.out.println("protectedVar = " + protectedVar);
        // System.out.println("defaultVar = " + defaultVar);   //NOT accessible
        // System.out.println("privateVar = " + privateVar);   //NOT accessible
    }
}
