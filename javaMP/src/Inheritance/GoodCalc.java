package Inheritance;

abstract class Calcul{
	public abstract int add (int a, int b);
	public abstract int sub (int a, int b);
	public abstract double avg(int [] a);
}
public class GoodCalc extends Calcul{
	@Override
	public int add(int a, int b) {
		return a + b ;
	}
	@Override
	public int sub(int a, int b) {
		return a - b ;
	}
	@Override
	public double avg(int[] a) {
		double sum =0;
		for (int i = 0; i<a.length;i++)
			sum+=a[i];
		return  sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.avg(new int [] {2,3,4}));
	}

}
