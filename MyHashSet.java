import java.io.*; 
import java.util.LinkedList; 

public class MyHashSet {
    
    HashObj hashObj[];


    /** Initialize your data structure here. */
    public MyHashSet() {
        this.hashObj = new HashObj[1000];
        for(int i=0;i<1000;i++){
            this.hashObj[i]= new HashObj();
        }
    }
    
    public void add(int key) {
        this.hashObj[key%1000].objLl.add(key);
        System.out.println("add");
    }
    
    public void remove(int key) {
        int c = this.hashObj[key%1000].objLl.indexOf(key);
        if(c!=-1){
            this.hashObj[key%1000].objLl.remove(c);
        }
        System.out.println("remove");
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        System.out.println(this.hashObj[key%1000].objLl.indexOf(key) != -1);
        return hashObj[key%1000].objLl.indexOf(key) != -1;
    }
    public static void main(String args[]){
         MyHashSet obj = new MyHashSet();
        obj.add(1);obj.add(2);obj.contains(1);obj.contains(3);obj.add(2);obj.contains(2);
        obj.remove(78);
        obj.contains(2);
    }
}

class HashObj {
    String objStr;
    LinkedList<Integer> objLl;
    public HashObj(){
        objStr="val";
        objLl = new LinkedList<>();
    }
}



/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */