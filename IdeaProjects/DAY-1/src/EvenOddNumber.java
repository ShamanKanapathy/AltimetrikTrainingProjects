import java.util.Scanner;

class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:" + i);
        if (i % 2 == 0) {
            System.out.println("It's an even number");
        }
        else {
            System.out.println("It's an odd number");
        }
        return i % 2 == 0;
    }
    public static class Demo extends EvenOddNumber{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int num = sc.nextInt();

        EvenOddNumber obj1 = new EvenOddNumber();
        obj1.findEvenOrOdd(num);

        sc.close();
    }
    }
}
