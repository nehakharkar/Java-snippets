import java.util.*;
public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for ( int i =1 ; i<11 ; i++)
        {
            int result= n  * i;
            System.out.println(n +" x "+ i + " = " + result);
        }
    }
}