package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removedublicatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list=new ArrayList<>();
    list.add(44);
    list.add(39);
    list.add(993);
    list.add(44);
    list.add(39);
    list.add(930);
    System.out.println(list);
    Set<Integer> a=new HashSet<>(list);
    System.out.println(a);
	}

}
