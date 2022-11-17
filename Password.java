 
import java.util.Random;

public class Password {
public static void main(String[] args) {
    String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower="abcdefghijklmnopqrstuvwxyz";
    String num="123456789";
    String specialChars="!@#$%^&*<>,(}[)_-+=";
    String combine=upper+lower+specialChars+num;
    int length=16;
    char[] password=new char[length];
    Random r= new Random();
    for(int i=0; i<length; i++){
        password[i]=combine.charAt(r.nextInt(combine.length()));
    }
    System.out.println("Generate:"+new String(password));
}
}