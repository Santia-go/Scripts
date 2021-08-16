//Solution of the homework

package lambda_Project;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Homework {

	public static void main(String[] args) {
		
		//Task 1. We will make a function which prints a text 
		
		Function<String, String> f1 = param -> "Printed text: " + param;
        String result = f1.apply("Text");
        System.out.println(result);
        //______________________________________________________________________________________________________//
        
        
        //Task 2. We will convert a text into UpperCase using a function

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("text to uppercase"));
        //______________________________________________________________________________________________________//
        
        
        //Task 3. We will to joint two text and convert them to Uppercase
        	
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Text  1 ", "Text 2");
        System.out.println(r2);
      //______________________________________________________________________________________________________//
        
        
        //Task 4. We will print the actual date using a function
        
        Consumer<Date> consumidor = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(date));
        };
        consumidor.accept(new Date());
      //______________________________________________________________________________________________________//
        
            
        //Task 5. Without proding parameters, we will print a text. 
        
        Supplier<String> proveedor = () -> "Using Suplier";

        System.out.println(proveedor.get());
      //______________________________________________________________________________________________________//
        
        
        //Task 6. We will compare if a number greater than another. 
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " + r);
        
	}

}



