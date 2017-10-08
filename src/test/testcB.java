package test;
import test.chocolateBoiled;
public class testcB {
	public static void main(String args[]) {
		chocolateBoiled cB;
		cB=chocolateBoiled.getExistencePot();
		cB.fill();
		cB.boil();
		cB.drain();
		
	}

}
