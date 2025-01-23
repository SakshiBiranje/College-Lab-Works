 import java.util.*;
 public class Collection1 {
        public static void main(String[] args) {

      // Collection<String> c = new ArrayList<>(); // all ok
        // Collection<String> c = new LinkedList<>();  // all ok
        Collection<String> c = new HashSet<>(); // [null, A, B, C]
       //Collection<String> c = new TreeSet<>(); // not null
       c.add("B"); 
       c.add("A"); 
       c.add("C"); 
       c.add(null); 
       c.add(null); 
       c.add(null); 
       System.out.println(c.toString()); 
       }
 }
