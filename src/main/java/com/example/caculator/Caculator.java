package com.example.caculator;

import org.springframework.stereotype.Service;

@Service
public class Caculator {
	public int sum(int a, int b) {
		return a + b;
	}
}
