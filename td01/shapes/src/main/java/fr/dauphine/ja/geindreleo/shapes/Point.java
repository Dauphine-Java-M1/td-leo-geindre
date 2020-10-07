package fr.dauphine.ja.geindreleo.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point
{

	private int x;
	private int y;
	@SuppressWarnings("unused")
	private static int cpt  = 0;
	
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		Point.cpt ++;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		Point.cpt ++;
	}
	
	@Override
	public boolean equals(Object o2) {
	if (!(o2 instanceof Point)) {
		return false;
	}
	Point p2 = (Point) o2;
	return x == (p2.x) && y == (p2.y);
	}
	
	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
	
	public boolean isSameAs(Point p) {
		return this.getX() == p.x && this.getY() == p.y;
	}

	public static void main( String[] args )
    {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
    }
}
