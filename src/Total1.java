import java.util.Scanner;

public class Total1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String bin = in.nextLine();
        char[] bin_arr = bin.toCharArray();
        int int_result = 0;
        int buff = 1;
        for (int i = bin.length()-1; i >= 0; i--) {
            if (bin_arr[i]=='1') {
                int_result += buff;
            }
            buff*=2;
        }
        System.out.printf("Десятичное число: %d \n", int_result);
    }
}