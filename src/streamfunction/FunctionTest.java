package streamfunction;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		MyFunction<String,Integer> fun = x -> x.length();
		System.out.println(fun.apply("virendra"));
		
		otherExample();
	}
	static void otherExample() {
		Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");   // 12

        System.out.println(result);
	}

}
@FunctionalInterface
interface MyFunction<T, R> {

   /**
    * Applies this function to the given argument.
    *
    * @param t the function argument
    * @return the function result
    */
   R apply(T t);
}
