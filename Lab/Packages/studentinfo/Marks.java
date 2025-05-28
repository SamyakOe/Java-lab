package studentinfo;
public class Marks {
    private int sub1, sub2, sub3, sub4, sub5;
    public Marks(int sub1,int sub2, int sub3, int sub4, int sub5){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        this.sub5=sub5;
    }
    public int getTotal(){
        return sub1+sub2+sub3+sub4+sub5;
    }
    public double getAverage(){
        return getTotal()/5.0;
    }
}