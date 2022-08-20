/*-----------------------------------------------------------------------------------------------------------------------	
	Point sınıfı test kodu	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Point p1 = new Point(34.6, 67.9);		
		Point p2 = new Point();
		Point p3 = new Point(34.8);		
		
		p1.print();
		p2.print();
		p3.print();
	}
}

class Point {
	public double x;
	public double y;
	
	public Point()	
	{		
	}
	
	public Point(double a)
	{
		x = a;
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));				
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}
}
