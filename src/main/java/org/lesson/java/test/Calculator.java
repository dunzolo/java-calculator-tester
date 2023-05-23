package org.lesson.java.test;

public class Calculator {
	private float num1;
	private float num2;
	
	public Calculator (float num1, float num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	//get e set
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num12) {
		this.num1 = num12;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	//methods
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}
	public float divide(float num1, float num2) throws Exception {
		
		if(num2 == 0) throw new Exception();
		return num1 / num2;
	}
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
