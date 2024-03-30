import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TH Giải phương trình bậc nhất
        System.out.println("Linear Equation Resoler");
        System.out.println("Given a equation as 'a*x +b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c -b) / a;
            System.out.printf("Equation with x = %f", answer);// Phương trình x=...
        } else {
            if ( b == c){
                System.out.println("The solution is all x!");// Phương trình vô số nghiệm
            } else {
                System.out.println("No solution!");// Phương trình vô nghiệm
            }

        }
    }
}