package practice;

	
import java.util.Map;  
import java.util.*;  



public class Trymap {  
   
        public static void main(String[] args) {          
        
        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        Map<Integer,String>a=new HashMap<>();
        Map<Integer,String>b=new HashMap<>();
        Map<Integer,String>c=new HashMap<>();
        Set<String>d=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of entries for college:");
        a1=Integer.parseInt(sc.nextLine());
        System.out.println("Enter no. of entries for school:");
        a2=Integer.parseInt(sc.nextLine());
        System.out.println("Enter no. of entries for persionaldata:");
        a3=Integer.parseInt(sc.nextLine());
        System.out.println("Enter no. of entries for extra activity:");
        a4=Integer.parseInt(sc.nextLine());
        for(int i=1; i<=a1; i++) {
        	 int id = 0;  
             String edu = "";  
             System.out.println("Enter name of college " + i + " education:");  
             edu = sc.nextLine();  
             id = id + i;  
             a.put(Integer.valueOf(id), edu);  
        }
        for(int i = 1; i <= a2; i++){  
            int id = 0;  
            String schl = "";  
            System.out.println("Enter name of school " + i + " education :");  
            schl = sc.nextLine();  
            id = id + i;  
            b.put(Integer.valueOf(id), schl);           
        }  
        for(int i = 1; i <= a3; i++){  
            int id = 0;  
            String person = "";  
            System.out.println("Enter name of person: " + i );  
            person = sc.nextLine();  
            System.out.println("Enter age of person: " + i );  
            person = sc.nextLine();  
            id = id + i;  
            c.put(Integer.valueOf(id), person);           
        }
        for(int i = 1; i <= a4; i++){  
            int id = 0;  
            String xc = "";  
            System.out.println("Enter your fav sport: " + i );  
            xc = sc.nextLine();  
            id = id + i;  
           d.add(xc);           
        }
        Map<String,Object>out=new HashMap<>();
        out.put("College",a);
        out.put("School", b);
        out.put("Persionaldata", c);
        out.put("Extra act", d);
        System.out.println(out);
        sc.close();
        
    }



}

