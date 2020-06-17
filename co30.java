package wiproms1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class co30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 34, 12, 45, 67, 89};
		List<Integer> distinctArray = new ArrayList<>();
		
		for (int item : array) {
			if (!distinctArray.contains(item))
				distinctArray.add(item);
		}
		
		System.out.println(Arrays.toString(distinctArray.toArray()));

	
}

	}
