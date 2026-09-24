package Practice;

import java.util.ArrayList;

public class DisjointSet {
    
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
