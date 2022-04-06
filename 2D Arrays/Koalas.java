import java.util.Arrays;

public class Koalas {
    public static int getTotal(int[] arr) {
        // Add your code below
        int total = 0;

        for(int koalasSpotted : arr){
            total += koalasSpotted;
        }

        return total;
    }

    public static int get2DArrTotal(int[][] arr){
        int total = 0;

        for(int[] row : arr){
            for(int koalaSpottedCol: row){
                total += koalaSpottedCol;
            }
        }

        return total;
    }

    public static int findValuesGreaterThan(int[][] arr2D, int num){
        int counter = 0;

        for(int i = 0; i < arr2D.length; i++){
            for(int j = 0; j < arr2D[0].length; j++){
                if(arr2D[i][j] > num){
                    counter++;
                }
            }
        }

        return counter;
    }

    public static int largestColumn(int[][] arr2D) {
        // Add your code below
        int largestColumn = 0;
        int largestSum = 0;

        for (int i = 0; i < arr2D[0].length; i++) {
            int columnVal = 0;
            for (int j = 0; j < arr2D.length; j++) {
                columnVal += arr2D[j][i];
            }
            if(columnVal > largestSum){
                largestSum = columnVal;
                largestColumn = i;
            }
        }
        return largestColumn;
      }

    public static void main(String[] args) {
        int[] dayOne = {17, 13, 19, 22};
        System.out.println(getTotal(dayOne));

        int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
        System.out.println(get2DArrTotal(koalaSpottings));

        System.out.println(findValuesGreaterThan(koalaSpottings, 20));
        System.out.println(largestColumn(koalaSpottings));
    }
}