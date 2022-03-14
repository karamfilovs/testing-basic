package lecture1;

public class IdealFaultConditions {

    public static double square(double x){
        double square = x + x; //should be x * x
        System.out.println("Square of " + x + " is: " + square);
        return square;
    }

    public static void main(String[] args) {
        square(2);
        square(0);
        square(3);
    }
}
