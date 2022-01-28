package assignments;

public class multithreading {

public static class multithreading15 extends Thread
{
	 
		public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		   System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread
		   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		   System.out.println("The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getThreadGroup()); // a group in whihc thread is assgined
		   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		   System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
		  }  
		
		 public static void main(String args[]){  
		  
		  multithreading15 m1=new multithreading15();  
		  multithreading15 m2=new multithreading15();  
		  multithreading15 m3=new multithreading15();
		  
		  m1.setName("Abc");
		  m2.setName("XYZ");
		  m3.setName("MNP");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
		 }  
		}     

}