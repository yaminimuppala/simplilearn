package assignments;

import java.awt.Adjustable;

public class table {

void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread3 extends Thread{  
Adjustable t;  
MyThread3(Adjustable t){  
this.t=t;  
}  
public void run(){  
((table) t).printTable(5);  
}  
  
}  
class MyThread4 extends Thread{  
Adjustable t;  
MyThread4(Adjustable t){  
this.t=t;  
}  
public void run(){  
((table) t).printTable(100);  
}  
}  
  
class MultiThreading_WithoutSynchronized{  
public static void main(String args[]){  
Adjustable obj = new Table();//only one object  
MyThread3 t1=new MyThread3(obj);  
MyThread4 t2=new MyThread4(obj);  
t1.start();  
t2.start();  
}  
}  