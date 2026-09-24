package Practice;

import java.util.ArrayList;

class DisjointSet {
    
    int size;

    ArrayList<Integer> rank;
    ArrayList<Integer> parent;

    DisjointSet(int size){
        this.size = size;

        for(int i=0;i<size+1;i++){
            rank.add(0);
            parent.add(i);
        }
    }

    int findParent(int node){
        if(parent.get(node)==node){
            return node;
        }
        int ultimateParent = findParent(parent.get(node));
        parent.set(node,ultimateParent);

        return ultimateParent;
    }
    
}
public class Main {

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);

        System.out.println(ds.findParent(5));
    }
    
}
