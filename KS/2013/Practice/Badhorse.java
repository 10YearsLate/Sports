import java.util.*;
import java.io.*;

public class Badhorse{
  static class Node{
    
    String name;
    ArrayList<Node> edges;
    
    Node(String n){
      name=n;
      edges=new ArrayList<Node>();
    }
  
  }

  public static Node[] addedge(Node a,Node b){
        a.edges.add(b);
        b.edges.add(a);
        Node[] n=new Node[2];
        n[0]=a;
        n[1]=b;
        return n;
  }


  public static void main(String[] args){
        boolean flag=true;
        HashSet<Node> hs=new HashSet<Node>();
        Scanner in =new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T=in.nextInt();
        for(int a=1;a<=T;a++){
            int M=in.nextInt();
            for(int b=0;b<M;b++){
                Node n1=new Node(in.next());
                Node n2=new Node(in.next());
                Node[] nd=addedge(n1, n2);
                hs.add(nd[0]);
                hs.add(nd[1]);
                
            }
            HashSet<String>nhs=new HashSet<String>();
            Iterator<Node> hsi=hs.iterator();
            while(hsi.hasNext() && flag){
                
                Node n=(Node)hsi.next();
                if(nhs.contains(n.name)) continue;
                else{
                    nhs.add(n.name);

                System.out.println(n.name);
                for(int i=0;i<n.edges.size();i++){
                    Node edge=n.edges.get(i);
                    for(int j=0;j<edge.edges.size();j++){
                        if(edge.name==(edge.edges.get(i).name)) {System.out.println("No");j=edge.edges.size();i=n.edges.size();flag=false;}
                    }
                }
            }
        
            } if(flag) System.out.println("Yes");
        }
  }

}
