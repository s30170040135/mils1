package wiproms1;

public class co32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 4)
			System.out.println("Please enter 4 integer numbers");
		
		int[][] array = new int[2][2];
		int[][] arrayReversed = new int[2][2];
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(args[x++]);
			}
		}		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				arrayReversed[array.length - 1 - i][array.length - 1 - j] = array[i][j];
			}
		}
		System.out.println("The given array is :");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("The reverse of the array is :");
		for (int i = 0; i < arrayReversed.length; i++) {
			for (int j = 0; j < arrayReversed[0].length; j++) {
				System.out.print(arrayReversed[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
