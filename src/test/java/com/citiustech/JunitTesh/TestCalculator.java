package com.citiustech.JunitTesh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	Calculator calculator = new Calculator();
    
	@Test
	public void giveTwoPositiveIntAndReturnPostivieResult() {
		int result=calculator.add(12, 12);
		assertEquals(24,result);
	}
	@Test
	public void sub() {
		int res=calculator.sub(15, 5);
		assertEquals(10, res);
		
	}
	
	public BookRepo BookRepo;
	
	public void getBookById() {
		Book book = new book();
		book.setid(12);
		book.setName("ashutosh");
		
		Book book2=bookRepo.getBookById(12);
		
	AssertEqual(book,book2);
		
	}
	
}
