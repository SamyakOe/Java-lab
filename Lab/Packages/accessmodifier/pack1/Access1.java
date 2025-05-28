package accessmodifier.pack1;
public class Access1 {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;            
    private int privateVar = 4;
    public void displayAll() {
        System.out.println("Access1:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
    }
}