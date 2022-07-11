import java.util.*;
public class TestDemo {
    public static int maxNum(int num1, int num2, int num3) {
        int max1 = num1 > num2 ? num1 : num2;
        return max1 > num3 ? max1 : num3;
    }

    public static int addTwoNum(int num1, int num2) {
        return num1 + num2;
    }
    public static int factor(int n) {
        if(n > 1) {
            return n * factor(n-1);
        }
        else {
            return 1;
        }
    }
    public static int getBitSum(int num) {
        if(num != 0) {
            return (num % 10) + getBitSum(num / 10);
        }
        else {
            return 0;
        }
    }
    public static int fabonaci(int num) {
        if(num == 1 || num == 2) {
            return 1;
        }
        else {
            return fabonaci(num - 1) + fabonaci(num - 2);
        }
    }
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        System.out.println(maxNum(num1, num2, num3));
//        String str = new String("dasdasd");
//        str = str.toUpperCase();
//        System.out.println(str);
//        System.out.println(factor(5));
//        System.out.println(getBitSum(5213));
//        System.out.println(fabonaci(40));
    }
}
