package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;



public class Removelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> a=new ArrayList<String>();
    a.add("Vishal");
    a.add("Sachin");
    a.add("Vikash");
    a.add("Dinesh");
    System.out.println(a);
    a.removeIf(new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.startsWith("V");
        }
    });
    System.out.println("if condition:"+a);
    a.remove(1);
    System.out.println(a);
    a.removeAll(a);
    System.out.println(a);
    List<Integer> b= new ArrayList<>();
    b.add(22);
    b.add(21);
    b.add(30);
    b.add(33);
    System.out.println(b);
    Iterator<Integer> itr=b.iterator();
    while(itr.hasNext()) {
    	Integer num=itr.next();
    	if(num%2==0) {
    		itr.remove();
    	}
    }
    System.out.println(b);
    }

}
