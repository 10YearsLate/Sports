import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;

public class solutionA2{

	public static void main(String[] args){
	
		long start = System.currentTimeMillis();
	
		remedy();
		
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F; 
		System.out.println(sec + " seconds");
	
	}
	
	public static void remedy(){
		
		boolean flag=true;
		
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int t=sc.nextInt();
		
		while(t-->0){
		
		int k=sc.nextInt();
	
		int[] leaves=new int[k];
		
		for(int i=0;i<k;i++){
			
			leaves[i]=sc.nextInt();
			
		}
		
		ArrayList<Integer> al;
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(1);
		
		for(int i=0;i<k;i++){
		
			al=new ArrayList<Integer>();System.out.println(al.size());
			if(leaves[i]>q.size()) {flag=false;break;} 
			while(leaves[i]>0){
			
				q.remove();
				leaves[i]--;
				
			
			}
			while(q.size()!=0){
			
				q.remove();
				al.add(1);
				al.add(1);
			
			}
			
			for(int j=0;j<al.size();j++){
			
				q.add(al.get(j));
			
			}
			
		}
		if(q.size()!=0) {flag=false;}
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");
		
		}
	
	}

}

