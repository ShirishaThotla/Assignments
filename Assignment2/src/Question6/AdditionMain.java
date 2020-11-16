package Question6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer>  newList = new ArrayList<Integer>();
		
		int k;
		do{				//k=-1 is a termination conditon...		
			k=scanner.nextInt();
			if(k!=-1)
				newList.add(k);
		}while(k!=-1);
		Addition addition= new Addition();
		addition.addValue(newList);
		
		addition = null;
		scanner = null;
	}

}
