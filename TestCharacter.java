package rpg;

public class TestCharacter {
    
    
    public static void main(String[]args){  
    Character Joe = new Character ("Joe",5,5,5);
    Character Bob = new Character ("Bob",5,5,5);  
        for (int i = 1 ; Joe.getCurrentLife() >= 0 && Bob.getCurrentLife () >= 0 ; i++ ){
            if(Bob.getCurrentLife()>=1 && Joe.getCurrentLife()>=1){
            System.out.println("Round " + i);            

            
            int a = Joe.attack();
            Bob.wound(a);
            int b = Bob.attack();
            Joe.wound(b);
            System.out.println(Joe.getName()+ ": " +Joe.getCurrentLife());
            System.out.println(Bob.getName()+ ": " + Bob.getCurrentLife());
            System.out.println(Joe.getName()+ " attacks " + Bob.getName() + " for " + a );
            System.out.println(Bob.getName()+ " attacks " + Joe.getName() + " for " + b);   
            
            }
           
            

            
    
        if (Bob.getCurrentLife() <= 0 && Joe.getCurrentLife() <= 0){

                System.out.println("Draw");  
                System.exit(0);
            }
            else if (Bob.getCurrentLife() <= 0){

                System.out.println("Joe wins");
                System.exit(0);
            }            
            else if (Joe.getCurrentLife () <= 0){

                System.out.println("Bob wins");   
                System.exit(0);
            }        
        }
    }
    
}
