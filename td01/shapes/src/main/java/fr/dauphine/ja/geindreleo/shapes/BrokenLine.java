package fr.dauphine.ja.geindreleo.shapes;

public class BrokenLine {

	private Point[] tab;
	
	public Point[] getTab() {
		return tab;
	}

	public void setTab(Point[] tab) {
		this.tab = tab;
	}

	public BrokenLine(Point[] ptab, int pmax) {
		if (ptab.length > pmax)
			throw new IllegalArgumentException("Tableau de dimension supérieur au max");
		this.tab = new Point[pmax];
		for (int i=0; i<pmax; i++) {
			this.tab[i]=ptab[i];
		}
	}

	public void add(Point p) {
		
	}

	
}
