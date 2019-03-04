package student;

public class ShowStudent {
    public static void main(String[] args) {        
        Student stud = new Student();        
        stud.setIdNumber("123456");
        System.out.println("ID number: " + stud.getIdNumber());
        stud.setCreditHours(6);
        System.out.println("The CreditHours: " + stud.getCreditHours());
        stud.setPoints();
        System.out.println("The Points: " + stud.getPoints());                
        System.out.println("The Average: " +  stud.finalAverage());        
        System.out.println("The Scale: " + stud.displayScale());       
    }
}
