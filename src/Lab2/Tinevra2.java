package Lab2;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
/**
 * Created by tinevra17 on 6/21/17.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Arrays;
public class Tinevra2 {

/*
     * readFromFile method reads trough a text file with numbers.
     * as it runs trough out the file it creates a 2d array of integers.
     * this method has exception to handle empty files and files not found.
     * @return a 2d array of integers

    public static int[][] readFromFile() {

        BufferedReader reader;
        BufferedReader reader2;
        int row =0;
        int column=0;
        String line = "";
        int[][] matrix= new int[0][0];
        int[]A = new int[0];

        Boolean successful = false;

        while (!successful) {

            
            try {
                //name of file
                Scanner scnr = new Scanner(System.in);
                String fileName = scnr.next();

                //rows lines
                reader = new BufferedReader(new FileReader(fileName));
                while (reader.readLine() != null) row++;
                /////////////////////////////////////////////////////////////////////////

                //columns size
                reader2 = new BufferedReader(new FileReader(fileName));
                String[] intString = reader2.readLine().split(" ");
                column = intString.length;

                //populating
                matrix =new int[row][column];
                BufferedReader reader3 = new BufferedReader(new FileReader(fileName));

                for (int i=0; i<row; i++) {
                    line = reader3.readLine();
                    String[] numbers = line.split(" ");
                    for (int j = 0; j < column; j++) {
                        matrix[i][j] = Integer.parseInt(numbers[j]);
                    }
                }
                System.out.println(Arrays.deepToString(matrix));

                successful = true;



            } catch (FileNotFoundException e) {
                System.out.println("file not found");

            } catch (NullPointerException e3){
                System.out.println("file empty");

            } catch (IOException e1) {
                System.out.println("something went wrong");
            }
        }
        return matrix;
    }*/

    //TODO if you throw a specific type of exception, make sure to catch it!

    /**
     * sum this method grabs two 2d arrays and adds them up
     * if the 2 arrays do not qualify for addition due to size
     * of the arrays an exception will be throw and catch.
     * @param matrix1 is a 2D array to make a sum with
     * @param matrix2 is a second 2D array to make the sum with
     * @return it return a new 2d array with the sum of the previous 2 arrays
     */
    public static int[][]sum(int[][]matrix1,int[][]matrix2){
        
        int[][] sum= new int[matrix1.length][matrix1[0].length];
        try {
            if(matrix1.length!=matrix2.length) throw new IOException();
            else if (matrix1[0].length!=matrix2[0].length) throw new IOException();
            //add an exception depending on the TA
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];

                }

            }

        
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | IOException e2) {
            return  null;
        }
        System.out.println(Arrays.deepToString(sum));
        return sum;
    }

    /**
     * * difference(subtraction) this method grabs two 2d arrays and subtract them up
     * if the 2 arrays do not qualify for subtraction due to size
     * of the arrays an exception will be throw and catch.
     * @param matrix1 is a 2D array to make a subtraction with
     * @param matrix2 is a second 2D array to make the subtraction with
     * @return it return a new 2d array with the subtraction of the previous 2 arrays
     */
    public static int[][]difference(int[][]matrix1,int[][]matrix2){
        System.out.println("File path 1 for subtraction: ");

        System.out.println("File path 2: ");
        int[][] dif= new int[matrix1.length][matrix1[0].length];
        try {
            if (matrix1.length != matrix2.length) throw new IOException();
            else if (matrix1[0].length != matrix2[0].length) throw new IOException();

            //add an expection
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    dif[i][j] = matrix1[i][j] - matrix2[i][j];

                }

            }

        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException | IOException e2) {
            return  null;
        }
        System.out.println(Arrays.deepToString(dif));
        return dif;
    }

    /**
     * multiplication this method grabs two 2d arrays and multiplies them up
     * if the 2 arrays do not qualify for multiplication due to size
     * of the arrays an exception will be throw and catch.
     * Also AB is defined only if the number of columns in A is equal to the number of rows in B.
     * if not an exception will be throw and catch.
     * @param matrix1 is a 2D array to make a multiplication with.
     * @param matrix2 is a second 2D array to make the multiplication with.
     * @return it return a new 2d array with the multiplication of the previous 2 arrays
     */
    public static int[][]matrixProduct(int[][]matrix1,int[][]matrix2){
        System.out.println("File path 1 for multiplication: ");
        System.out.println("File path 2: ");
        int row = matrix1.length;
        int column = matrix2[0].length;
        int[][] multiA= new int[row][column];
        try{
            if(row!=column) throw new IOException();
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < column; j++) {
                    for(int k = 0; k < matrix1[0].length; k++) {
                        multiA[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | IOException e2) {
            return  null;
        }
        System.out.println(Arrays.deepToString(multiA));
        return multiA;
    }

    /**
     * pow this method grabs a 2d array and multiplies it by
     * itself has many times the int pow. this method has an null exception
     * @param matrix1 is the 2D array for which the method will calculate its product by itself.
     * @param pow is the power for which the user wants to compute for matrix1.
     * @return it return a new 2d array with the multiplication of the 2d array by itself.
     */
    public static int[][] pow(int[][]matrix1,int pow){
        System.out.println("File path for power: ");
        int[][] product=new int[matrix1.length][matrix1[0].length];
        int row = matrix1.length;
        int column = matrix1[0].length;
        try{
            if (pow < 0) throw new IOException();
            if(pow==0) {
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        product[i][j] = 0;
                    }
                }
                System.out.println(Arrays.deepToString(product));
                return product;
            }
            for (int b = 0; b <pow ; b++) {
                for(int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        for (int k = 0; k < row; k++) {
                            product[i][j] += matrix1[i][k] * matrix1[k][j];
                        }
                    }
                }

            }


        
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | IOException  | InputMismatchException e2) {
            return  null;
        }

        System.out.println(Arrays.deepToString(product));
        return product;
    }

    /**
     *
     * intMultiplication takes a 2D array and an integer provided by the user.
     * ones it has that information then multiplies each number of the 2D array
     * by the number provided by the user.
     * the array by the number provided by the user.
     * @param matrix1 is the 2D array given by the user 
     * @param num is the integer for which the user wnats to multiply matrix1 content.
     * @return a new 2D array with the product of the multiplication of each int in matrix1.
     */
    public static int[][]intMultiplication(int[][]matrix1,int num) {
       
        try {
            
            if (num < 0) throw new IOException();
            
        }catch (NullPointerException | IOException | InputMismatchException e2) {
            return null;
        }

        int[][] mult = new int[matrix1.length][matrix1[0].length];


        //add an expection
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                mult[i][j] = matrix1[i][j] * num;
            }
        }
        System.out.println(Arrays.deepToString(mult));
        return mult;
    }

    /**
     * transpose takes a 2D array and creates a new one based on its transpose of the first one.
     * The transpose of a matrix is a new matrix whose rows are the columns of the original.
     * @param matrix1 is the array for which the user wants to check if its transpose
     * @return a new 2D array which is the transpose of the input array matrix1
     */
    public static int[][] transpose(int[][]matrix1){
        System.out.println("File path for transpose: ");
        int[][]transposeA = new int[matrix1[0].length][matrix1.length];
        int column = matrix1.length;
        int row = matrix1[0].length;
        try{
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <column ; j++) {
                    transposeA[i][j]=matrix1[j][i];

                }

            }
       
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e2) {
            return  null;
        }
        System.out.println(Arrays.deepToString(transposeA));

        return transposeA;

    }

    /**
     * isSymmetric takes a 2D array and checks if it is symetric based on its transpose
     * @param isSym is the 2D array provided by user to check if its transpose
     * @return a boolean which  tells the user if the 2D array is a symmetric 2D array.
     */
    public static Boolean isSymmetric(int[][]isSym){
        System.out.println("File path for symmetric check: ");
        int [][] check = new int[isSym[0].length][isSym.length];
        int column = isSym.length;
        int row = isSym[0].length;

        try{
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <column ; j++) {
                    check[i][j]=isSym[j][i];

                }
            }
           // System.out.println(Arrays.deepToString(check));

            if(check.length!=isSym.length) return false;
            if(check[0].length!=isSym[0].length)return false;

            for (int i = 0; i <check.length ; i++) {
                for (int j = 0; j < check[0].length; j++) {
                    if(isSym[i][j]!=check[i][j])return false;

                }

            }
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e4){
            return null;
       
        }
        return true;
    }
}
