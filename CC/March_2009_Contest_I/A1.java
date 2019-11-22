import java.util.*;
import java.io.*;
import java.lang.Systems.*;


public class A1{

    public static void main(String[] args){
    
      Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      
      int t=sc.nextInt();
      while(t-->0){
          boolean flag=false;
          int n=sc.nextInt();
          int m=sc.nextInt();
          
          int[] a=new int[n];
          for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
          }
          a=Arrays.sort(a);
          int low=0;
          int high=n-1;
          while(low<high){
          
            if(a[low]==m||a[high]==m ||(a[low]+a[high])==m) flag=true;
            if(a[low]+a[high]>m) {high--;continue;}
            if(a[low]+a[high]<m) {m-=a[low];low++}
          }
          
      
      }
    
    }


}
