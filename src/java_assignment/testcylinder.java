package java_assignment;

class TestCylinder{
	public static void main (String[] args) {
		cylinder c1 = new cylinder();
		System.out.println("Cylinder:"+ " radius=" + c1.getRadius()+ " height=" + c1.getheight()+ " base area=" + c1.getArea()+ " volume=" + c1.getVolume());
		cylinder c2 = new cylinder(10.0);
	}
}
