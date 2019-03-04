package exponent2;
import java.util.Scanner;
public class Exponent2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int in=sc.nextInt();
        System.out.println("the square of the numer is: "+ square(in));
        System.out.println("the cube of the numer is: "+ cube(in));
        System.out.println("the squared number and cubed number is: "+another(in));
        
    }
    static int square(int in){
        int square=in*in;
        return square;
    }
    static int cube(int in){
        int cube=in*in*in;
        return cube;
    }
    static int another(int in){
        int another=cube(in)*square(in);
        return another;
    }
    
}

    
    

