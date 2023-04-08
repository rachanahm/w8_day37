//Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.
import java.util.*;
class Rectangle{
  double length;
  double width;
  Rectangle(double length,double width){
    this.length=length;
    this.width=width;
  }
  double getArea(){
    return length*width;
  }
}
  class rect{
  public static void main(String[] args){
    ArrayList<Rectangle> rectangle=new ArrayList<Rectangle>();
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<3;i++){
      rectangle.add(new Rectangle(sc.nextDouble(),sc.nextDouble()));
    }
    for(Rectangle rectangles:rectangle){
            if (rectangles.length == 2.5) {
                rectangle.remove(rectangle.indexOf(rectangles));
            }
        }
     for(Rectangle rectangles:rectangle){
      System.out.println("Area is:"+rectangles.getArea());
    }
  }
  }

