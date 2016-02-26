package base;

public class MyInteger {
	
	// Declaring iValue
	static int iValue;

	// Constructor
	public MyInteger(int value) {
		iValue = value;
	}
	
	// Create getter
	public int get_iValue() {
		return iValue;
	}
	
	// iValue Methods
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 2; i <= iValue/2; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static Methods for specified value

	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int x) {
		if (x % 2 != 0) {
			return true;
			} 
		else {
			return false;
		}
	}

	public static boolean isPrime(int x) {
		for (int i = 2; i <= x/2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static Methods for MyInteger

	public static boolean isEven(MyInteger x) {
		return x.isEven();
	}

	public static boolean isOdd(MyInteger x) {
		return x.isOdd();
	}

	public static boolean isPrime(MyInteger x) {
		return x.isPrime();
	}
	
	//Equals methods
	
	public static boolean equals(int x){
		if(x == iValue){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean equals(MyInteger x){
		if (iValue == x.get_iValue()){
			return true;
		}
		else{
			return false;
		}
	}
}