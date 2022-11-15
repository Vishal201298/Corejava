package practice;

interface Printable{
	void a();
}  
class A implements Printable{  
public	void a() {
		System.out.println("Hi");
	}
public void b(){System.out.println("b method");}  
}  
class B implements Printable{ 
	public	void a() {
		System.out.println("Hi");
	}
public void c(){System.out.println("c method");}  
}  
  
class Call{  
void invoke(Printable p){  
if(p instanceof A){  
A b=(A)p;   
b.b();  
}  
if(p instanceof B){  
B c=(B)p;  
c.c();  
}  
  
}  
}//end of Call class  
  
class Interfaces{  
public static void main(String args[]){  
A p=new A();
p.a();
Call c=new Call(); 
c.invoke(p); 
B d=new B();
d.a();
Call e=new Call(); 
e.invoke(d); 
 
}  
}  