import java.util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String [] args){
        //int [] rons(declaration) = new int[5](intialization);
        //or directly we can write as
        //int [] rnos = {1,2,3,4}
        //System.out.println( rons);
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[3][3];
        //for(int i=0;i<5;i++){
            //arr[i]=sc.nextInt();
        //}
        //System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){//for(int[] a :arr)
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
