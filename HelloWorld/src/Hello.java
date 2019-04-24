import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println(helloToReturn(sc.nextLine()));
        }
        String f = "fjeifi";
        Integer a = 1;
        int s = 2;
        System.out.println(f+a);
        System.out.println(a);
        System.out.println(s);
    }
    private static String helloToReturn(String name){
        return "Hello " + name;
    }
}
