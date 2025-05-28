public class Student {
    int roll;
    String name;
    float[] marks= new float[5];
    Student(int roll, String name, float[] marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    float getAverage(){
        int sum=0;
        for(int i=0;i<marks.length;i++)
            sum+=marks[i];
        return sum/marks.length;
    }
    void getGrade(){
        float avg =getAverage();
        if(avg>=90)
            System.out.println("Grade: A+");
        else if(avg<90 && avg >=80)
            System.out.println("Grade: A");
        else if(avg<80 && avg >=70)
            System.out.println("Grade: B+");
        else if(avg<70 && avg >=60)
            System.out.println("Grade: B");
        else if(avg<60 && avg >=50)
            System.out.println("Grade: C+");
        else if(avg<50 && avg >=40)
            System.out.println("Grade: C");
        else if(avg<40 && avg >=30)
            System.out.println("Grade: D");
        else
            System.out.println("Fail!");
    }
    void getResult(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Average Marks: "+getAverage());
        getGrade();
    }
    public static void main(String[] args) {
        float[] marks={63,43,54,76,44};
        Student std = new Student(12,"Samyak",marks);
        std.getResult();
    }
}