package practice;

import java.util.HashMap;

public class Mapcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Float,String> a= new HashMap<>();
		a.put(1f, "Ashish");
		a.put(2f, "Ram");
		a.put(3f,"Parvesh");
		a.put(4f, "Sachin");
		System.out.println(a);
		HashMap<Double,String> b= new HashMap<>();
		b.put(1d, "Ashish");
		b.put(2d, "Ram");
		b.put(3d,"Parvesh");
		b.put(4d, "Sachin");
		System.out.println(b);

	}

}
