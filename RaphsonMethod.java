public class RaphsonMethod {
    public static void main(String[] args) {
        System.out.print(sqrt(8));

    }
    static double sqrt(int n) {
        double x=n;
        double root;
        while (true) {
            root = 0.5*(x+(n/x));
            if (Math.abs(root-x)<.2) {
                break;
            }
            x=root;
        }
        return (int)root;
    }
}
