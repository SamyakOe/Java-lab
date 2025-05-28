public class Time {
    int hours, minutes, seconds;
    Time(int hours,int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    void convertIntoSecs(){
        minutes+=(hours*60);
        seconds+=(minutes*60);
    }
    void convertIntoHours(){
        minutes=seconds/60;
        seconds%=60;
        hours=minutes/60;
        minutes%=60;
    }
    public static void main(String[] args) {
        Time time = new Time(2, 34, 15);
        time.convertIntoSecs();
        System.out.println("Conversion into seconds:");
        System.out.println(time.seconds);
        time.convertIntoHours();
        System.out.println("Conversion into hours, minutes and seconds:");
        System.out.println(time.hours+":"+time.minutes+":"+time.seconds);
    }
}
