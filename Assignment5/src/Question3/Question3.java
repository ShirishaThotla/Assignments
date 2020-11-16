package Question3;

public class Question3 {

	long  power(int num1,int num2) {
		
		long result=0;
		try {
			if(num1 >0 && num2>0) {
				result = (long) Math.pow(num1, num2);
			}
			else if(num1==0 && num2==0) {
				throw new UserDefinedException("java.lang.Exception: n and p should not be zero");
			}
			else if(num1<0 && num2<0) {
				throw new UserDefinedException("java.lang.Exception: n and p should not be negative");
			}
			else {
				throw new UserDefinedException("java.lang.Exception: n and p should not be negative");
			}
		}
		catch(UserDefinedException e) {
			System.err.println(e.getMessage());
		}
		
		return result;
	}
}
