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
		
		//Task 1. We will make a function that displays a text in the console. 
		
		Function<String, String> f1 = param -> "Printed text: " + param;
        String result = f1.apply("Text");
        System.out.println(result);
        //______________________________________________________________________________________________________//
        
        
        //Task 2. We will convert a text to uppercase using a lambda function.

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("text to uppercase"));
        //______________________________________________________________________________________________________//
        
        
        //Task 3. We will join two texts and convert them to uppercase.
        	
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Text  1 ", "Text 2");
        System.out.println(r2);
      //______________________________________________________________________________________________________//
        
        
        //Task 4. Display the current date in any format in the console. 
        
        Consumer<Date> consumidor = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(date));
        };
        consumidor.accept(new Date());
      //______________________________________________________________________________________________________//
        
            
        //Task 5. Without providing parameters, we will display a text in the console.
        
        Supplier<String> proveedor = () -> "Using Suplier";

        System.out.println(proveedor.get());
      //______________________________________________________________________________________________________//
        
        
        //Task 6. We will compare if one number is greater than another. 
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " + r);
        
	}

}



