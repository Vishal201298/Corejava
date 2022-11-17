import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        // int num=0;
        // int c=0;
        //  c=n/2;
        // if(n==0 || n==1){
        //      System.out.println("Not a prime number");
        // }else{
        //     for(int i=2; i<=c; i++){
        //         if(n%i==0){
        //         System.out.println("Not a prime number");
        //         num=1;
        //         break;
        //         }
        //     }
        // if(num==0){
        //     System.out.println("Its prime number");
        // }
        // }
        boolean flag = false; 
    if(n==0 || n==1){
        System.out.println("Not prime number");
    }else{
    for (int i = 2; i <= n / 2; ++i) {
      if (n % i == 0) {
        flag = true;
        break;
      }
    }
    
    if (!flag)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
    }
}
}
