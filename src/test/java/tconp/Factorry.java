package tconp;


import org.testng.annotations.Test;

public class Factorry {
	
 private int param;	
	public Factorry(int param) {
		this.param = param;
	}
 @Test
 public void test1() {
	 int op=param+1;
	 System.out.println(op);
	 
 }
 @Test
 public void test2() {
	 int d=param+2;
	 
System.out.println(d);
}
 @Test
 public void test3() {
	 int a=param+3;
	 System.out.println(a);
 }

 
}
