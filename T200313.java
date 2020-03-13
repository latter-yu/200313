import java.util.Scanner;

public class T200313 {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }
    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//n = 5
        int ret = sum(n);
        System.out.println(ret);//n = 15
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fab(n);
        System.out.println(ret);
    }
    public static int fab(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = addSum(n);
        System.out.println(ret);
    }
    public static int addSum(int n) {
        int sum = 0;
        int num = 0;
        if (n > 9) {
            num = addSum(n / 10);
        }
        sum = num + n % 10;
        return sum;
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print(n);
        print1(n);
    }
    public static void print(int n) {
        //迭代
        while (n != 0) {
            System.out.print(n % 10 + " ");//3 2 1
            n = n / 10;
        }
    }
    public static void print1(int num) {
        //递归
        System.out.printf("\n");

        if (num > 9) {
            print1(num / 10);
        }
        System.out.print(num % 10 + " ");//1 2 3
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 30;
        int ret1 = max(a, b);
        System.out.println("ret1 = " + ret1);//30
        double a2 = 21.4;
        double b2 = 28.5;
        double ret2 = max(a2, b2);
        System.out.println("ret2 = " + ret2);//28.5

        double ret3 = max(a2, b2, b);
        System.out.println("ret3 = " + ret3);//30.0
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static double max(double x, double y) {
        return x > y ? x : y;
    }

    public static double max(double x, double y, int z) {
        return max(max(x, y), z);
    }
}
