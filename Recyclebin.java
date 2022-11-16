package practice;

import java.util.ArrayList;
import java.util.List;

public class Recyclebin {
	public List<String> m11(){
		 List<String> a=new ArrayList<String>();
		    a.add("Vishal");
		    a.add("Sachin");
		    a.add("Vikash");
		    a.add("Dinesh");
		    System.out.println(a);
		    List<String> c=new ArrayList<String>(a);
		    c.removeAll(c);
		    System.out.println("Remove All:" +c);
		   return a;
	}   

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recyclebin d=new Recyclebin();
		List<String> e=new ArrayList<String>(d.m11());
		 
	    List<String> b=new ArrayList<String>();
	    e.addAll(b);
	    System.out.println("Restore All:" +e);
		   
	}

}
