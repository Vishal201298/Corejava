import java.util.*;
public class Convert {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input minut: ");
        String p="Am";
	    	double minut = a.nextInt();
      //  long S = seconds % 60;
      double H = minut/ 60;
        double M = H % 60;
     //   H = H / 60;
        if(H>=0 && H<=11.59 && p=="Am"){
             H = minut/ 60;
         M = H % 60;
    //     p="Am";
        System.out.print( H + ":" + M +" "+"Am"+" " +"Good Morning");
        }else if(H>=12 && H<=3.59 && p=="Pm"){
            H = minut/ 60;
            M = H % 60;
            p="Pm";
            System.out.print( H + ":" + M +" "+"Pm"+" " +"Good Afternoon");
        }else if(H>=4 && H<=5.59 && p=="Pm"){
            H = minut/ 60;
            M = H % 60;
            p="Pm";
            System.out.print( H + ":" + M +" "+"Pm" +" "+"Good Evening");
        }else if(H>=6 && H<=11.59 && p=="Pm"){
            H = minut/ 60;
            M = H % 60;
            p="Pm";
            System.out.print( H + ":" + M +" " +"Pm"+" " +"Good Night");
        }
		System.out.print("\n");
    }
}
