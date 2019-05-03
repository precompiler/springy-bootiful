package com.github.precompiler.externalizedproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomValues {
	public RandomValues(@Value("${my.secret}") String secret,
			@Value("${my.number}") Integer number,
			@Value("${my.bignumber}") Long big,
			@Value("${my.uuid}") String uid,
			@Value("${my.number.less.than.ten}") Integer lessThan10,
			@Value("${my.number.in.range}") Long numberInRange) {
		System.out.println("============");
		System.out.println(secret);
		System.out.println(number);
		System.out.println(big);
		System.out.println(uid);
		System.out.println(lessThan10);
		System.out.println(numberInRange);
	}
}
