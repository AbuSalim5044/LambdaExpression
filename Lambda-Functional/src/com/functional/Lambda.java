package com.functional;

public class Lambda {
	
	public static void main(String[] args) {
		
		MyInter i1= () -> System.out.println("This is first time I am using lambda expression 1");
		i1.fun();
		
		MyInter i2= () -> System.out.println("This is secuond time I am using lambda expressin 2");
		i2.fun();
		
		SumInter s= (int a, int b) -> {
			return a + b;
		};
		System.out.println(s.sum(4, 5));
		System.out.println(s.sum(32, 21));
		
		SumInter sumInter=(a, b)-> a+b;
		 System.out.println("Short ."+sumInter.sum(1231, 212));
		 
		 LengthInter lengthInter=str -> str.length();
		 
		 System.out.println("Length of the String is :"+lengthInter.getlength("I am Abu Salim sss"));
		 
		 Runnable thread1= () -> {
			 for(int i=1;i <=10;i++) {
				 System.out.println("Value of i is :"+i);
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		 };
		 
		 Thread t=new Thread(thread1);
		 t.setName("Alqma");
		 t.start();
		 System.out.println(t.getName());
		 
		 Runnable t22=()-> { 
			 
			 try {
			 for(int i=1;i<=10;i++) {
				 System.out.println(+i*2);
			 }
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
			 }
		 };
		 
		 Thread tr=new Thread(t22);
		 tr.start();
	}

}
