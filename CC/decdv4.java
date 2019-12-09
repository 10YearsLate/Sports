import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class decdv4{
	
	public static void main(String[] args){

		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T=Integer.parseInt(sc.nextLine());
		while(T-->0){

		String A=sc.nextLine();
		String B=sc.nextLine();
		BigInteger a, b;
        
		b=new BigInteger(B.trim(),2);
		a=new BigInteger(A.trim(),2);

		if(b.compareTo(new BigInteger("0"))==0) {
			System.out.println(0);
			return;
		}

		if(a.compareTo(new BigInteger("0"))==0) {
			System.out.println(1);
			return;
		}

		//BigInteger a=new BigInteger("11100",2);
		//BigInteger b=new BigInteger("1010",2);

		BigInteger and=a.and(b);   //1001
		BigInteger xor=a.xor(b);   //0100
		BigInteger an=a.not();     // 0010
		BigInteger bn=b.not();     // 0110
		BigInteger nand=an.and(bn);// 0010

		BitSet bs  = BitSet.valueOf(and.toByteArray());
		BitSet bs1 = BitSet.valueOf(nand.toByteArray());
		BitSet bs2 = BitSet.valueOf(xor.toByteArray());

		int result=0;
		int previndex=0;
		int cnt;
		for (int i = bs.nextSetBit(0); i >= 0;i = bs.nextSetBit(i+1) ) {
     		cnt=0;
     		System.out.println(i);
			for(int j=previndex;j<i;j++){

				System.out.println(i+"  "+j+".  "+cnt);

				if(bs1.get(j)) break;
				else{

					if(bs2.get(j)) cnt++;

				}



			}



			result=Math.max(result,cnt);
			previndex=i;
			//if(bs.nextSetBit(i+1)==-1) i=
 		}
 		System.out.println(previndex);
 		int cnt2=0;
 		while(previndex<xor.bitLength()){
 			System.out.println("Inside last while");

 			if(bs1.get(previndex)) break;
				else{

					if(bs2.get(previndex)) cnt2++;

				}

				previndex++;

 		}
 		result=Math.max(result,cnt2);

 		System.out.println(result+2);

 	}
		
	}

	public static int countcarry(int index,int pi,BigInteger a,BigInteger b){

		byte[] a1=BitSet.valueOf(a.toByteArray()).toByteArray();
		byte[] b1=b.toByteArray();
		//System.out.print(b1);

		return 1;


	}
}