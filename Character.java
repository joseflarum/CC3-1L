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
public class Character {
    static Dice dice = new Dice ();
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentlife;        
    
    
    public Character (String n, int s, int d, int i){
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i; 
        this.maxLife = dice.roll()+20;
        this.currentlife = maxLife;
    }  
    public int attack(){
        return dice.roll() + strength;        
    }
    public void wound (int damage){
        currentlife = currentlife - damage;
        
    }
    public void heal (int heal){
        if (currentlife < maxLife){
        currentlife = currentlife + heal;
        }
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
       
    }
    public int getIntelligence(){
        return intelligence;
        
    }
    public int getCurrentLife(){
       if (currentlife < 0){
           currentlife = 0;
       } 
       return currentlife;
    }
    public int getMaxlife(){
        return maxLife;
    }
    public void setCurrentLife(int life){
        this.currentlife=life;
    }

}