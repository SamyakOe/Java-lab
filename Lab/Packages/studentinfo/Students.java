package studentinfo;
public class Students {
    private String name;
    private int roll;
    public Students(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
}

