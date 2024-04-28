import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 33, 1, 33, -33};

        System.out.println("the max value is " + maxi(arr));
        System.out.println("the min value is " + mini(arr));
        System.out.println("difference between max and min is " + difference(maxi(arr), mini(arr)));

        System.out.println("2nd smallest value = " + secondSmallest(arr));

        System.out.println("difference between smallest value and second smallest value is " + difference(secondSmallest(arr),mini(arr)));

        double A = 4, B = 5;
        System.out.println("the solution is : " + formula(A,B));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.printf("x² + (4y/5 - x)² = %d² + ((4 * %d)/5 + %d)² = %f%n", num1, num2, num1, formula(num1,num2));

    }
//  Task_1
    private static int maxi(int[] A) {
//      Variables

        int max = A[0];

        // Finding the Max and Min values
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {

                max = A[i];

            }
        }
        return max;
    }

    private static int mini ( int[] A){
        int min = A[0];

        // Finding the Max and Min values
        for (int i = 0; i < A.length; i++) {

            if (A[i] < min) {
                min = A[i];
            }
        }
            return min;
        }

        public static int difference (int a, int b){


            return a - b;

        }
//  Task_2
        private static int secondSmallest(int[] A){

            int min = mini(A);
            int minSec = Integer.MAX_VALUE;

            for (int i = 0; i < A.length; i++) {
                if (A[i] < min) {
                    minSec = min;

                } else if (A[i] < minSec && A[i] != min) {
                    minSec = A[i];
                }
            }
            return minSec;

        }

//  Task_3
    private static double formula(double x,double y){

            double A = 4 * y;
            double B = A / 5;
            double C = B - x;
            return Math.pow(x, 2) + Math.pow(B,2);



        }
}


