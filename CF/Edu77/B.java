import java.util.*;
import java.io.*;

public class B{

    public static void main(String[] args){
        remedy();
    }

    private static void remedy() {

        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(((a+b)%3==0) || ((a==2*b)||b==2*a)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}