import java.util.*;
import java.lang.Math.*;
import java.io.*;

public class findhindex{
	
	

	public static void main(String[] args){
		
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T=sc.nextInt();
		int count=1;
		while(T>=count){
			System.out.print("Case #"+count+": ");
			count++;
			
			int N=sc.nextInt();
			int[] a=new int[N];
			for(int i=0;i<N;i++){
				
				a[i]=sc.nextInt();
				
			}
	
			//int a[] ={1,3,3,2,2,15};
		
		
			int b[] = new int[100001];
			int h=-1;
		
		
			for(int i=0;i<a.length;i++){
		
				for(int j=1;j<=a[i];j++){
					if(b[j]==-1) b[j]=0;
					b[j]++;
					if(j==b[j])
					h=Math.max(h,j);
				}
			
			System.out.print(h+" ");
			
			
			}
			System.out.println("");
		}
		
		
		
	}

}
