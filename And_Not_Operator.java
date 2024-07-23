package Operators;

public class And_Not_Operator {

	public static void main(String[] args) {
		int age = 20;
		char gender = 'f';
		
		
		if(!(age>10 && gender=='f')) {
			System.out.println("Both teh condition is true and I will execute 1");
		}
		if(!(age>20 && gender=='f') ){
			System.out.println("Both teh condition is true and I will execute 2");
		}
		if(!(age>10 && gender=='m')) {
			System.out.println("Both teh condition is true and I will execute 3");
		}
		if(!(age==20 && gender=='m')) {
			System.out.println("Both teh condition is true and I will execute 4");
		}

	}

}
