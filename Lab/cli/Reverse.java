public class Reverse {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder(args[0]);
        obj.reverse();
        System.out.println(obj);
    }
}
