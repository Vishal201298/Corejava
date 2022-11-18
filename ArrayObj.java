package Array.Arraylist;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

class Objects{
    String name;
    int age;
    Objects(String Name,int Age){
        this.name=Name;
        this.age=Age;
       
    }
       public String getName(){
        return name;
       }
       public void setName(String Name){
       this.name=Name;
       }
       public int getAge(){
        return age;
       }
       public void setAge(int Age){
        this.age=Age;
       }
}
public class ArraylistObj {
    public static void main(String[] args) {
    List<Objects> users=new ArrayList<>();
    users.add(new Objects("Vishal",23));
    users.add(new Objects("Ankit", 36));
    users.add(new Objects("Sunil", 30));
    users.forEach(user->{System.out.println("Name:"+ user.getName() +",Age:" +user.getAge());});
}
}