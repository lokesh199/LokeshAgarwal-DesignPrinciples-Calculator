package workingBackend;

import workingBackend.Calculator;

public class Multiplication extends Calculator {
	private int number1,number2;
	@Override
	public void getNumbers(int a, int b) {
		// TODO Auto-generated method stub
		super.getNumbers(a, b);
		this.number1=a;
		this.number2=b;
	}
	
	@Override
	public int operation() {
		// TODO Auto-generated method stub
		return mul();
	}
	
	private int mul() {
		return number1*number2;
	}
}
