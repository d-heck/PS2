package base;

public class MyInteger {
	
	// Declaring iValue
	int iValue;

	// Constructor
	public MyInteger(int value) {
		iValue = value;
	}

	// Create setter
	public void set_iValue(int value) {
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
		for (int i = 2; i < iValue; i++) {
			if (iValue % 1 == 0) {
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
		} else {
			return false;
		}
	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % 1 == 0) {
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
	
	public boolean equals(int x){
		if(x == iValue){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean equals(MyInteger x){
		return x.equals(iValue);
	}
}
