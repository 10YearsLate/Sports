public class Badhorse{
  class Node{
    
    String name;
    ArrayList<Node> edges;
    
    Node(String n){
      name=n;
      edges=new ArrayList<Node>();
    }
  
  }


  public static void main(String[] args){
  
        HashSet<Node> hs=new HashSet<Node>();
  
        Node Dead=new Node("Dead");
        hs.add(Dead);
        
        Node Fake=new Node("Fake");
        hs.add(Fake);
        
        Node Fury=new Node("Fury");
        hs.add(Fury);
        
        Dead.edges.add(Fake);
        Fake.edges.add(Dead);
        
        Fake.edges.add(Fury);
        Fury.edges.add(Fake);
        
        Fury.edges.add(Dead);
        Dead.edges.add(Fury);
        
        
        while(hs.hasNext()){
        
        Node n=hs.next();
        for(int i=0;i<n.edges.size();i++){
            Node edge=n.edges.get(i);
            for(int j=0;j<edge.edges.size();j++){
              if(n.edges.contains(edge.edges.get(i)) {System.out.println("No";return;}
            }
        }
        
        }
        
        
        
  
  }

}
