package arrays;

public class CollegeSystem {

	public static void main(String[] args) {
		int [] marks = new int[5];   
		marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        int [] newMarks = {98, 45, 79, 99, 80};
        System.out.println(marks[4]);
        System.out.println(newMarks[0]);
        for(int i = 0;i<5;i++) {
        	System.out.println("Value at "+ i + "th index is " + newMarks[i]);
        }
        for(int element: marks){
            System.out.println(element);
        }
        int [][] matrix =  new int[3][3] ;  //2-D array of 3 rows + 3 columns
        matrix[0][0] = 100;
        matrix[0][1] = 101;
        matrix[0][2] = 102;

	}

}
