package java_assignment;
class cylinder extends Circle{
	private double height;
	public cylinder(){
		super();
		height=1.0;
	}
	public cylinder(double height){
		super();
		this.height=height;
	}
  public cylinder(double radious,double height){
	  super(radious);                        
	  this.height=height;  
  }
  public double getheight(){
	  return height;
  }
  public double getVolume(){
	    return getArea()*height;
	  }
}