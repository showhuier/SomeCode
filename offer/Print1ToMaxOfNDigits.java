package offer;

import java.util.Arrays;

/**
 * Created by z.xiaohui02 on 2016/11/19.
 */
public class Print1ToMaxOfNDigits {
    public static void print1ToMaxOfNdigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }
//        do {      从0开始打印
//            printNumber(number);
//        }while(!increment(number));
        while (!increment(number)) {
            printNumber(number);
        }
    }

    public static boolean increment(char[] number) {
        boolean isOverFlow = false;
        int nTakeOver = 0;
        int nLength = number.length;
        for (int i = nLength - 1; i >= 0; i--) {
            int nSum = number[i] - '0' + nTakeOver;
            if (i == nLength - 1)
                nSum++;
            if (nSum >= 10) {
                if (i == 0)
                    isOverFlow = true;
                else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) (nSum + '0');
                }

            } else {
                number[i] = (char) ('0' + nSum);
                break;
            }
        }
        return isOverFlow;
    }

    public static void printNumber(char[] number) {
        int beginIndex = 0;
        int i = 0;
        for (; i < number.length; i++) {
            if (number[i] != '0') {
                break;
            }
        }
        boolean allZeros = false;
        if (i == number.length)
            allZeros = true;

        for (; i < number.length; i++) {
            System.out.print(number[i]);
        }
        if (!allZeros)
            System.out.print('\t');
    }


    public static void print1ToMaxOfNDigitsRe(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }

        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, n, 0);
        }
    }

    public static void print1ToMaxOfNDigitsRecursively(char[] number, int length, int index) {
        if (index == length - 1) {
            printNumber(number);
            return;
        }

        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, length, index + 1);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        //char[] cc=new char[2];
        //System.out.print(Arrays.toString(cc));
        print1ToMaxOfNdigits(n);
        System.out.println();
        print1ToMaxOfNDigitsRe(n);
    }
}
