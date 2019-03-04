/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class CharacterDuel {

    public static void main(String[] args) {
        Dice D = new Dice();

        Wizard Joe = new Wizard("Joe", 5, 5, 5);
        Character Bob = new Character("Bob", 5, 5, 5);

        int a = 0, b = 0;
        Joe.setCurrentLife(100);
        Bob.setCurrentLife(100);
        for (int i = 1; Joe.getCurrentLife() >= 0 && Bob.getCurrentLife() >= 0; i++) {
            if (Bob.getCurrentLife() >= 1 && Joe.getCurrentLife() >= 1) {
                System.out.println("Round " + i);
                System.out.println(Joe.getName() + ": " + Joe.getCurrentLife() + "//Joe current magic is: " + Joe.currentmagic);

                System.out.println(Bob.getName() + ": " + Bob.getCurrentLife());

                if (D.roll() % 2 == 0) {

                    a = Joe.castLightningBolt();
                    System.out.println(Joe.getName() + " cast Lightning bolt to " + Bob.getName() + " for " + a);

                    Bob.wound(a);
                } else if (D.roll() % 2 != 0) {
                    a = Joe.castHeal();
                    System.out.println(Joe.getName() + " cast heal for " + a);
                    Joe.currentlife +=a;
                }
                b = Bob.attack();
                Joe.wound(b);
                System.out.println(Bob.getName() + " attacks " + Joe.getName() + " for " + b);
                System.out.println("==================================================================================");
                System.out.println("");

            }

            if (Bob.getCurrentLife() <= 0 && Joe.getCurrentLife() <= 0) {

                System.out.println("Draw");
                System.exit(0);
            } else if (Bob.getCurrentLife() <= 0) {

                System.out.println("Joe wins");
                System.exit(0);
            } else if (Joe.getCurrentLife() <= 0) {

                System.out.println("Bob wins");
                System.exit(0);
            }
        }
    }
}
