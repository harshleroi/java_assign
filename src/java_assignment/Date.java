package java_assignment;

public class Date {
	   
       private int month;
       private int day;
       private int year;
       
       public Date(int x,int y,int z){
    	 month = x;   
    	   day = y; 
    	   year= z;
       }
       
       public int getmonth() {
    	   return month;
       }
       public int getday(){
    	   return day;
       }
       public int getyear() {
    	   return year; 
       }
       public void setmonth(int x) {
    	    month=x;
       }
       public void setday(int y){
    	    day=y;
       }
       public void setyear(int z) {
    	   year=z; 
       }
       public void displayDate() {
    	   System.out.printf("%d/%d/%d",month,day,year);
       }
       
}
