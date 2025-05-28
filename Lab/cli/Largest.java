public class Largest {
    public static void main(String[] args) {
        int great=Integer.parseInt(args[0]);
        for(int i=1;i<args.length;i++){
            if(great<Integer.parseInt(args[i]))
                great=Integer.parseInt(args[i]);
        }
        System.out.println("The Greatest value is "+great);
    }
}
