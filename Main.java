
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int SIZE = 50;
		boolean[][] array = new boolean[SIZE+1][SIZE+1];
		for (int i=1; i<array.length; i++) {
			for (int j=1; j<array[0].length; j++) {
				array[i][j] = true;
			}
		}
		
		for (int idx=2; idx<=SIZE; idx++) {
			for (int i=1; i<array.length; i++) {
				for (int j=1; j<array[0].length; j++) {
					if ((i+j)%idx == 0) {
						array[i][j] = !array[i][j]; 
					}
				}
			}
		}
		for (int i=1; i<array.length; i++) {
			for (int j=1; j<array[0].length; j++) {
				if (array[i][j]) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
				//System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
