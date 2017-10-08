package test1;

public class main {
	public static void main(String[] args) {
		tst a=new tst();
		a.tstPrivate();
		a.tstPublic();
		System.out.println(a.tst);
		a.tstProtected();
		a.tstDefault();
	}
}
