package fr.dauphine.ja.geindreleo.td00;

import java.util.ArrayList;

/**
 * Bonjour!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public void initRandom(int n, int m) {
		for (int i = 0; i < n; i++) {
			numbers.add((int) (Math.random()*m + 2));
		}
	}
	
	public boolean isPrime(int p) {
		boolean test = true;
		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p%i == 0) {
				test = false;
			}
		}
		return test;
	}
	
	public void printPrimes() {
		for (int i = 0; i < numbers.size(); i++) {
			if (isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i));
			}
		}
	}
	
    public static void main( String[] args )
    {
    	ArrayList<Integer> list = new ArrayList<>();
    	PrimeCollection p = new PrimeCollection(list);
    	p.initRandom(100, 2000);
    	p.printPrimes();
    }
}
