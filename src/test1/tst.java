package test1;

public class tst {
	public String tst="public";
	private String tst1="private";
	public void tstPublic(){
		System.out.println(tst);
	}
	public void tstPrivate(){
		System.out.println(tst1);
	}
	protected void tstProtected(){
		System.out.println("protected");
	}
	void tstDefault(){
		System.out.println("default");
	}

}
