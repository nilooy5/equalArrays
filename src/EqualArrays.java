import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter SIZE of First Array: ");
        int a = input.nextInt();
        System.out.print("Enter SIZE of Second Array: ");
        int b = input.nextInt();

        int [] arrayA = new int[a];
        int [] arrayB = new int[b];

        if (arrayA.length != arrayB.length) {
            System.out.println("Arrays are Not Equal");
            return;
        }

        System.out.print("Enter Elements of First Array: ");
        for(int i=0;i<arrayA.length;i++) {
            arrayA[i]= input.nextInt();
        }
        System.out.print("Enter Elements of Second Array: ");
        for(int i=0;i<arrayB.length;i++) {
            arrayB[i]= input.nextInt();
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        System.out.println("Class Activity 2 by Munira Tabassum : ");

        System.out.println("Checking if the arrays are equal: ");

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i])
            {
                System.out.print("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
