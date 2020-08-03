import java.io.*; 
import java.util.LinkedList; 
public class MyHashSet {
    
    HashObj hashObj[];


    /** Initialize your data structure here. */
    public MyHashSet() {
        this.hashObj = new HashObj[6000];
    }
    
    public void add(int key) {
        if(this.hashObj[key%6000] == null){
            this.hashObj[key%6000] = new HashObj();
        }
        this.hashObj[key%6000].objLl.add(key);
    }
    
    public void remove(int key) {
    	if(this.hashObj[key%6000] == null){
            return ;
        }
        int c = this.hashObj[key%6000].objLl.indexOf(key);
        for(;c!=-1;){
            this.hashObj[key%6000].objLl.remove(c);
            c = this.hashObj[key%6000].objLl.indexOf(key);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
    	if(this.hashObj[key%6000] == null){
            return false;
        }
        return hashObj[key%6000].objLl.indexOf(key) != -1;
    }


    public static void main(String args[]){
         MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        obj.contains(1);
        obj.contains(3);
        obj.add(2);
        obj.contains(2);
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


