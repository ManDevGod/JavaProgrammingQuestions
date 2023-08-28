package NumberSwap;

public class NumberSwapSolution {

    public static void main(String[] args) {

        int a = -8, b = 10;

        solutionMethod1(a, b);
        solutionMethod2(a, b);
    }

    public static void solutionMethod1(int num1, int num2) {
        System.out.println("Before Swap");
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);

        var temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap");
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);
    }

    public static void solutionMethod2(int num1, int num2) {
        System.out.println("Before Swap");
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("After Swap");
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);
    }



}
