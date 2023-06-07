package OperatorsBasics;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(989809));
    }
    public static int reverseNum(int number) {
        int reversed_num = 0;
        while(number != 0) {
            int lnum = number % 10;
            reversed_num = reversed_num * 10 + lnum;
            number/=10;
        }
        return reversed_num;
    }
}