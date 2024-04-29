package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 65;
        int b = 40;

        int result = a;
        System.out.println(result);

        result += b;
        // result = result + b;
        System.out.println(result);

        //result = result - a;
        result -= a;
        System.out.println(result);

        result *= 5;
        // result = result * 5; result = 40 * 5;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

        result %= a;
        System.out.println(result);


    }
}
