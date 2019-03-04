package salary;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        double HPR, RH, OTH;
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your Hourly Pay Rate: ");
        HPR=sc.nextInt();
        System.out.println("What is your regular hours: ");
        RH=sc.nextInt();
        System.out.println("what is your over time hours");
        OTH=sc.nextInt();
        System.out.println("The salary is: "+regularpay(HPR, RH, OTH));
    }
    static double regularpay(double HPR,double RH,double OTH){
        double regularpay=(double) ((RH*HPR)+(OTH*1.5*HPR));
        return regularpay;
    }
    
}
