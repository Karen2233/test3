package test;

public class chocolateBoiled {
private static chocolateBoiled existencePot=null;
private boolean empty;
private boolean boiled;
chocolateBoiled() {
	empty=true;
	boiled=false;
}
public static chocolateBoiled getExistencePot() {
	if(existencePot==null) {
		existencePot=new chocolateBoiled();
	}
	return existencePot;
}
public void fill() {
	if(empty==true) {
		System.out.println("fill the pot");
		empty=false;
	}
	else {
		System.out.println("pot already has filled");
	}
}
public void boil() {
	if(empty==false&&boiled==false) {
		System.out.println("chocolateBoiled");
		boiled=true;
	}
	else if(empty==true) {
		System.out.println("pot is empty");
	}
	else if(empty==false&&boiled==true)
		System.out.println("chocolate has boiled");
}
public void drain() {
	if(empty==false&&boiled==true) {
		System.out.println("drain the chocolate");
		empty=true;
		boiled=false;
	}
	else if(empty==true) {
		System.out.println("pot is empty");
	}
	else if(empty==false&&boiled==false) {
		System.out.println("chocolate is boiling");
	}
}
public static void main(String args[]) {
	chocolateBoiled tst=getExistencePot();
	tst.fill();
	tst.boil();
	tst.drain();
}
}
