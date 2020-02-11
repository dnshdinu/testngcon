package tconp;

import org.testng.annotations.Test;

public class Groupss {

	@Test(dependsOnMethods="select")
	public void updates() {
		System.out.println("first");
	}
	
	@Test(dependsOnMethods="insert")
	public void select() {
		System.out.println("second");
	}
		@Test(dependsOnMethods= {"update"})
		public void delect() {
						System.out.println("three");
		}
	@Test
	public void insert() {
		System.out.println("four");
	}
	

}
