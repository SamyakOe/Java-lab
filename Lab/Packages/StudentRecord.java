import studentinfo.*;
public class StudentRecord {
    public static void main(String[] args) {
        Students myStudent = new Students("Samyak",12);
        Marks myMarks= new Marks(45, 89, 56, 58, 87);
        Result myResult = new Result(myStudent, myMarks);
        myResult.display();
    }
}
