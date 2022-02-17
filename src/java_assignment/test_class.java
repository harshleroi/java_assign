package java_assignment;

public class test_class {
	public class TestCircle {        // save as "TestCircle.java"
		   public static void main(String[] args) {
		      Circle c1 = new Circle();
		      System.out.println("The circle has radius of " 
		         + c1.getRadius() + " and area of " + c1.getArea());		   
		      Circle c2 = new Circle(2.0);
		      // Use the dot operator to invoke methods of instance c2.
		      System.out.println("The circle has radius of " 
		         + c2.getRadius() + " and area of " + c2.getArea());
		   }
	}
}
