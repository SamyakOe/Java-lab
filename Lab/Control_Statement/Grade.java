import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int[] marks=new int[5];
        int total=0;
        float percent;
        boolean fail=false;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        for(int i=0;i<marks.length;i++){
            System.out.println("\nEnter the marks of subject "+(i+1)+":");
            marks[i]=input.nextInt();
            total+=marks[i];
            if(marks[i]<30)
                fail=true;
        }
        if(fail)
            System.out.println("FAIL!!!");
        else
        {
            percent=(total/500.00f)*100;
            System.out.println("Obtained Percentage: "+percent+"%");
            switch ((int)(percent-1)/10){
                case 9:
                        System.out.println("Grade: A+");
                    break;
                case 8:
                        System.out.println("Grade: A");
                    break;
                 case 7:
                        System.out.println("Grade: B+");
                    break;
                case 6:
                        System.out.println("Grade: B");
                    break;   
                case 5:
                        System.out.println("Grade: C+");
                    break; 
                case 4:
                        System.out.println("Grade: C");
                    break; 
                default:
                    System.out.println("Grade: D");
                    break;
            }
        input.close();
        }
    }
}
