import java.util.Scanner;
public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]array1=new double[2];
        for(int i=0;i<array1.length;i++){
            System.out.print("Enter element "+i+" of array1: ");
            array1[i]=scanner.nextInt();
        }
        int[]array2={3,6,8};
        int[]array3=new int[5];
        for (int i=0;i<array1.length;i++){
            array3[i]= (int) array1[i];
        }
        for(int i=0;i<array2.length;i++){
            array3[array1.length+i]=array2[i];
        }
        System.out.print("Array3 = Array1 concates Array2 : ");
        System.out.print('{');
        for (int i=0;i<array3.length-1;i++){
            System.out.print(array3[i]+",");
        }
        System.out.printf("%d%s",array3[array3.length-1],"}");

    }
}