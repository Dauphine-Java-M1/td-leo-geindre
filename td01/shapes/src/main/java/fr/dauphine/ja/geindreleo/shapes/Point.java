package fr.dauphine.ja.geindreleo.shapes;

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
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

	public static void main( String[] args )
    {
    	Point p = new Point(1,1);
    	System.out.println(p);
    }
}
