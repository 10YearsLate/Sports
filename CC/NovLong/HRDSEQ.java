import java.util.HashMap;

public class HRDSEQ{

  public static void main(String[] args){

      solve();
  }

    private static void solve() {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        HashMap<Integer,Integer> lo=new HashMap<Integer,Integer>();

        hm.put(0,1); 
        //lo.put(0,1);
        int current=0;
        int pos=1;
        while(pos<=9){
            //System.out.print(current+" ");
            if(hm.get(current)==1) {
                hm.put(0,hm.get(0)+1);
                current=0;
                lo.put(0,pos);
                pos++;
                
            }
            else{

                int l=pos;
                int k=lo.get(current);
                System.out.println(l+" "+k);
                if(hm.containsKey(l-k)){
                    hm.put((l-k),hm.get(l-k)+1);
                    current=l-k;
                    lo.put(current,pos);
                    pos++;
                }
                else{
                    current=l-k;
                    hm.put(current,1);
                    lo.put(current,pos);
                    pos++;
                }
                
            }         
        }

        //System.out.println(hm.keySet());

    }
  


}
