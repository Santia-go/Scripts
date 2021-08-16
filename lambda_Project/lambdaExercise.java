//Calculate the mean betwenn two numbers


package lambda_Project;

import java.util.function.BiFunction;

public class lambdaExercise {

	public void calc() {
		
		
		// Imperative programming
		/*Mean mean = new Mean() {
			
			@Override
			public double calMean(double n1, double n2) {
				
				return (n1+n2)/2;
				
			}
			
		};
		System.out.println(mean.calMean(10.0, 10.0));*/
		
		//Using Lambda Expressions
		
		Mean mean = (double x, double y)->(x+y)/2;
		System.out.println(mean.calMean(15.0, 10.0));
	}
	
	
	public static void main(String[] args) {
		lambdaExercise app = new lambdaExercise();
		app.calc();

		//Using Lambda Functions
		
		BiFunction <Double, Double, Double> f1=(a,b)->(a+b)/2;
		System.out.println(f1.apply(15.0, 20.0));
		
		

	}

}
