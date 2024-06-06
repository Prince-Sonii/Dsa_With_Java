package LambdaFunction;

public class LambdaFunc {
    public static void main(String[] args) {
        Operation sum = (a,b) ->a+b;
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;
        Operation remainder = (a,b) -> a%b;

        System.out.println(remainder.perform(20,2));
        System.out.println(sum.perform(21,22));

    }
}
interface Operation {
    int perform(int a,int b);
}
