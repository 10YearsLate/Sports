import java.util.*;
import java.io.*;

public class inputgenerator{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		//System.out.println("Enter Test Case Range low and high");
		Random rand=new Random();
		
		int T_low=sc.nextInt();
		int T_high=sc.nextInt();
		int N_low=sc.nextInt();
		int N_high=sc.nextInt();
		int h_low=sc.nextInt();
		int h_high=sc.nextInt();
			
			
		int T=rand.nextInt(T_high)+T_low;
		System.out.println(T);
		for(int i=0;i<T;i++){
			
			int N=rand.nextInt(N_high)+N_low;
			System.out.println(N);
			
			for(int j=0;j<N;j++){
			
			int h=rand.nextInt(h_high)+h_low;
			System.out.print(h+" ");
				
			}
			System.out.println("");
			
		}
		
		
		
	}

}
