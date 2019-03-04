package exponent;
import java.util.Scanner;
public class Exponent {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int in=sc.nextInt();
        System.out.println("the square of the numer is: "+ square(in));
        System.out.println("the cube of the numer is: "+ cube(in));
    }
    static int square(int in){
        int square=in*in;
        return square;
    }
    static int cube(int in){
        int cube=in*in*in;
        return cube;
    }
    
}
