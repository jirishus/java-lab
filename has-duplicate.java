import java.util.*;

public class smashModule {
  public static void main(String []args){
   System.out.println("app init");
   
   int[] myList = {2,3,4,3};
   Duper dupe = new Duper();
   System.out.println(dupe.hasDup(myList));
   
  }
}

class Duper {
 public boolean hasDup(int[] nums) {
  if (nums.length == 0) return false;
  
  HashSet<Integer> appeared = new HashSet<>();
  
  // iterate HashSet
  for (int n : nums) {
   if (!appeared.add(n)) {
      System.out.println(n);
      return true;
    }
  }
  
  return false;
 }
 
}
