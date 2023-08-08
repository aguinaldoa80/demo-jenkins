package com.teste.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class CalculatorTest {
  CalculatorController calc = new CalculatorController();
  
  @Test
	public void shouldBeTrue() {
    assertEquals(calc.soma().getStatusCodeValue(), 200);
	}

}
