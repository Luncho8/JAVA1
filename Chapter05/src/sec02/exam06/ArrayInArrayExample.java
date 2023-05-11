package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i <mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores["+ i +"]["+ j +"] = "+ mathScores[i][j]);
			}
		}
		System.out.println();
		
		
		int[][] arr1 = new int[2][];
		arr1[0] = new int[2];
		arr1[1] = new int[3];
		
		for(int i = 0; i <arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println("arr1["+ i +"]["+ j +"] = "+ arr1[i][j]);
			}
		}
		System.out.println();
	}

}
