import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{5, 2, 8, 1, 3};

        Arrays.sort(num);
        System.out.println("Ascending: " + Arrays.toString(num));

        System.out.print("Descending: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        Scanner scanner=new Scanner(System.in);
                int[]numbers=new int[]{10,15,20,25,30};
                System.out.println("first index:");
                int index1= scanner.nextInt();
                System.out.print("second index:");
                int index2=scanner.nextInt();
                int temp = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = temp;
                System.out.println("new array:");

                for (int i = 0; i< numbers.length;i++){
                    System.out.print(numbers[i]+" ");
        }
System.out.println();

                int []num1={10,11,12,13,14,15,16};
                System.out.print("even numbers:");
                for(int i =0;i< num1.length;i++){
                    if (num1[i]%2==0) {
                        System.out.print(num1[i]+" ");

                    }


                }
                System.out.println();
        int[] number1 = {10, 20, 10, 50,30, 20, 40, 30,50};

        for (int i = 0; i < number1.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (number1[i] == number1[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(number1[i] + " ");
            }
        }

        System.out.println();

        int[] numbers2 = {10, 5, 20, 8, 30, 15};

        Arrays.sort(numbers2);

        int secondSmallest = numbers2[1];
        int secondLargest = numbers2[numbers2.length - 2];

        System.out.println("Second smallest: " + secondSmallest);
        System.out.println("Second largest: " + secondLargest);





        

    }
}