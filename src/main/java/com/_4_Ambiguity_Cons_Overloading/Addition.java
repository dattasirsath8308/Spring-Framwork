package com._4_Ambiguity_Cons_Overloading;

public class Addition {
	
	private int a;
	private int b;
	
	
	
	public Addition(int a, int b) {
		int r1 = this.a = a;
		int r2 = this.b = b;
		System.out.println( "Parameterized Constructor type of:  int : "+r1 +" , int :"+r2);
		
	}
	
	
	public Addition(double a, double b) {
		int r1 = this.a = (int) a;
		int r2 = this.b = (int) b;
		System.out.println( "Parameterized Constructor type of:  double : "+r1 +" , double :"+r2);
		
	}
	
	
	public Addition(String a, String b) {
		int r1 = this.a = Integer.parseInt(a);
		int r2 = this.b = Integer.parseInt(b);
		System.out.println( "Parameterized Constructor type of:  String : "+r1 +" , String :"+r2);
		
	}

	
	public void DisplaySum()
	{
			System.out.println("Addtion is : "+(this.a + this.b));
	}
	
}
