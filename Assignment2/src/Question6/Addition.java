package Question6;

import java.util.List;

public class Addition {

	public void addValue(List<Integer> array) {
		
			String s=String.valueOf(array.get(0));
			int sum	=array.get(0);
			
			for (int i = 1; i < array.size(); i++)  {
					
				s += "+"+String.valueOf(array.get(i));
				sum	+=	array.get(i);
				
				System.out.print(s+"=");
				System.out.println(sum);
			}
		}
		
}
