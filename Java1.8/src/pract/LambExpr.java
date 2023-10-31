package pract;

public class LambExpr {
	
	public static void main(String []args) {
		MyInterface mit = () -> System.out.println( "M1 method call"); 

	mit.m1();
	}

}
