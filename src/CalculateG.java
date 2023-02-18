public class CalculateG {
    public static double multi(double x, double y){
        return x*y;
    }
    public static double square(double x){
        return x*x;
    }
    public static double sum(double x,double y){
        return x+y;
    }

    public static void outline(String message,double value){
        System.out.println(message+""+value+"m.");
    }
    public static void main(String[]args) {
        double gravity = -9.81;//Earths gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity = multi(gravity, fallingTime) + initialVelocity;
        double initialPosition = 0.0;
        double FinalPosition = multi(0.5, multi(gravity, square(fallingTime))) + multi(initialVelocity, fallingTime) + initialPosition;
        outline("The objects position after", fallingTime);
        outline("The objects velocity after", fallingTime);

    }
}