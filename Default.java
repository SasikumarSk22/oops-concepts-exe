package OOPS;
import java.lang.Math;

interface  Poly
{
void getArea();

// calculate the perimeter of a Polygon
default void getPerimeter(int... sides) 
{
   int perimeter = 0;
   for (int side: sides) {
      perimeter += side;
   }

System.out.println("Perimeter: " + perimeter);
}
}

class Tri implements Poly {
private int a, b, c;
private double s, area;

//initializing sides of a triangle
Tri(int a, int b, int c) {
   this.a = a;
   this.b = b;
   this.c = c;
   s = 0;
}

//calculate the area of a triangle
public void getArea() {
   s = (double) (a + b + c)/2;
   area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
   System.out.println("Area: " + area);
}
}

class Default 
{
public static void main(String[] args) 
{
   Tri t1 = new Tri(2, 3, 4);

//calls the method of the Triangle class
   t1.getArea();

//calls the method of Polygon
   t1.getPerimeter(2, 3, 4);
}
}