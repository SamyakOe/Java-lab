package studentinfo;
public class Result {
    private Students student;
    private Marks marks;
    public Result(Students student, Marks marks){
        this.student=student;
        this.marks=marks;
    }
    public String getGrade(){
        double avg=marks.getAverage();
        if(avg>=90) return "A+";
        else if(avg>=80 && avg<90) return "A";
        else if(avg>=70 && avg<80) return "B+";
        else if(avg>=60 && avg<70) return "B";
        else if(avg>=50 && avg<60) return "C+";
        else if(avg>=40 && avg<50) return "C";
        else if(avg>=30 && avg<40) return "D";
        else return "Fail!";
    }
    public void display(){
        System.out.println("Student Name: "+student.getName());
        System.out.println("Roll No: "+student.getRoll());
        System.out.println("Total Marks: "+marks.getTotal());
        System.out.printf("Average: %.2f\n",marks.getAverage());
        System.out.println("Grade: "+getGrade());
    }
}
