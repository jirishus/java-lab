// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        // Doer doer = new Doer();
        // System.out.println(doer.doubleIt(5));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        
        //System.out.println(list);
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        
    }
}

class Doer {
    int doubleIt(int n) {
        return n * 2;   
    }
}
