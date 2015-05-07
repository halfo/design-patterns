package io.github.halfo;

public class Model {
	private long result;

	public void addTwoNumbers(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
	}

	public long getResult() {
		return result;
	}
}
