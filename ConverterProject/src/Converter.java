import java.util.Scanner;

public class Converter {

    public static int decimalToBinary(int number){
        String str = Integer.toBinaryString(number);
        number = Integer.parseInt(str);
        return number;
    }

    public static int binaryToDecimal(int number){
        String num = String.valueOf(number);
        int decimal = Integer.parseInt(num, 2);
        return decimal;
    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the decimal number");
//        int n = sc.nextInt();
//        System.out.println(binaryToDecimal(n));
//    }
}
