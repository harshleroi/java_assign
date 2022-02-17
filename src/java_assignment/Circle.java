package java_assignment;

public class Circle {
	 private double radius;
	   private String color;
	   
	   // 1st constructor, which sets both radius and color to default
	   public Circle() {
	      radius = 1.0;
	      color = "red";
	   }
	   
	   // 2nd constructor with given radius, but color default
	   public Circle(double r) {
	      radius = r;
	      color = "red";
	   }
	   
	   // A public method for retrieving the radius
	   public double getRadius() {
	     return radius; 
	   }
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
}