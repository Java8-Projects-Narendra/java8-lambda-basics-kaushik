package com.java;

public class GreetingLambda {
	
	//Pass implementation of Greeter
	public void greet(Greeter greeter){
		greeter.greet();
	}

	public static void main(String[] args) {
		//Normal way using annonymous inner class
		Greeter anonymousGreeter = new Greeter() {
			@Override
			public void greet() {
				System.out.println("Inner class world greeter");
			}
		};
		
		GreetingLambda greetLambda = new GreetingLambda();
		greetLambda.greet(anonymousGreeter);
		
		// Lambda way
		Greeter  lambdaGreeter = () -> System.out.println("Lambda way 1 greeting");
		greetLambda.greet(lambdaGreeter);
		
		// Lambda way 2 direct passing
		greetLambda.greet(() -> System.out.println("Lambda way 2 greeting"));
		
		//Commit from master branch
		//Commit from Test branch

	}

}

@FunctionalInterface
interface Greeter{
	void greet();
} 
