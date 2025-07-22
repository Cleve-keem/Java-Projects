public class Kata {
	public static boolean checkIsEven(int value){
        return value % 2 == 0;
	}


	public static int subtract(int a, int b){
		int addedResult = a - b;

		if(0 > addedResult) {
			return addedResult * - 1;
		}

		return addedResult;
	}

	public static float divide(int a, int b){
		if(b == 0){
			return 0;
		}
		return (float) a /b;
	}

	public static int factorOf(int num){
		int count = 0;
		for(int i = 1; i <= num; i++){
			if(num % i == 0){
				count++;
			}
		}
		return count;
	}

	public static int factorialOf(int x){
		if(x > 0){
			return x * factorialOf(x - 1);
		}else{ return 1; }
	}

	public static int squareOf(int num){
		return num * num;
	}

	public static void main(String[] args){
		boolean result1 = checkIsEven(5);
		boolean result2 = checkIsEven(8);


		int subResult = subtract(3, 7);
		float quotient = divide(10, 0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(subResult);
		System.out.println(quotient);

		int totalFactorResult = factorOf(10);
		int factorialResult = factorialOf(5);

		System.out.println(totalFactorResult);
		System.out.println(factorialResult);
		System.out.println(squareOf(5));
	}
}
