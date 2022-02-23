package BinarySearchTree;

public class SortedMatrix {

	public void search(int[][] matrix , int n,int key) {
		int i =0;
		int j = n-1;
		
		while(i<n && j>=0) {
			if(matrix [i][j] ==key) {
				System.out.println(key+" found at - "+i+","+j+" position");
				return;
			}
			if(matrix[i][j] > key) {
				j--;
			}
			else {
				i++;
			}
			
		}
		System.out.println(key+" key not found");
	}
	public static void main(String[] args) {
		int[][] matrix = {
				{2,4,6,8},
				{10,12,14,16},
				{18,20,22,24},
				{26,28,30,32}
		};
		SortedMatrix search = new SortedMatrix();
		search.search(matrix, matrix.length, 26);
		search.search(matrix, matrix.length, 25);
	}
}
