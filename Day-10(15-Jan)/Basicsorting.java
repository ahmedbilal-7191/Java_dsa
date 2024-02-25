import java.util.*;
public class Basicsorting{

    public static void diagonalSum(int matrix[][]){
        int sum1=0;
        int sum2=0;
        int temp=1;
        for (int i = 0; i <matrix.length; i++) {
            sum1+=matrix[i][i];
            sum2+=matrix[i][matrix.length-temp];
            temp++;
        }
        int sum=sum1+sum2;

        System.out.println(sum);
    }
    public static void main(String args[]){

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(matrix);
    }
}