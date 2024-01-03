package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int [][] lk = new int [2][3];
		lk [0][0]= 12;
		lk [0][1]= 13;
		lk [0][2]= 10;
		lk [1][0]= 14;
		lk [1][1]= 15;
		lk [1][2]= 18;
	
		for(int i=0;i<2;i++){
			for(int j = 0; j<3;j++) {
				System.out.print(lk[i][j] + " ");
			}
			System.out.println();
		}
	}

}
