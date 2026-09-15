package com.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
//		Predicate<Integer> pd = n-> n >10;
//		System.out.println(pd.test(12));
		
//		Function<Integer, Integer> fun = n -> n*100;
//		System.out.println(fun.apply(1000));
//		
		
//		Consumer<String> cs = name -> System.out.println(name);
//		cs.accept("Sandeep kumar");
		
		
//		Supplier<String> st = () -> "Hello Word";
//		System.out.println(st.get());
		
		
		Predicate<String> st = name -> name.isEmpty();
		
		
		System.out.println(st.test(""));
		System.out.println(st.test("Hello"));
	}

}
