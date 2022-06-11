package string;

import java.util.Scanner;

public class Test1{
	
	public static void main(String[] args) {
		System.out.println("Enter values");
	Scanner sc= new Scanner(System.in);
	String n1="1";
	String n2=sc.next();
	Scanner n=new Scanner(n1);
	Scanner e=new Scanner(n2);
	 {

	if(n.hasNextDouble() && e.hasNextDouble()) {
		double d1=Double.parseDouble(n1);
		double d2=Double.parseDouble(n2);
		System.out.println((d1+d2)/2);
	}else {
		System.out.println("use double");
	}}
	sc.close();
	
	}
	}
