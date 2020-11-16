package Question1;

public class SmallestNumber {

	public int SmallestNumber(int num1,int num2,int num3) {
		
		int small_number=(num1<=num2)?((num1<=num3)?num1:num3):(num2>num3)?num2:num3;	     
		return small_number;
	}
}
