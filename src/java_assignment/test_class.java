package java_assignment;

public class test_class {
	public class TestCircle {     
		   public static void main(String[] args) {
		      Circle c1 = new Circle();
		      System.out.println( "radius = " + c1.getRadius() + " and area is = " + c1.getArea());		   
		      Circle c2 = new Circle(2.0);
		      System.out.println( "radius = " + c2.getRadius() + " and area is = " + c2.getArea()); 
		   }
	}
}