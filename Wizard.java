package rpg;

public class Wizard extends Character {

    Dice d = new Dice();
    protected int currentmagic, maxmagic;

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        currentmagic = maxLife;
        maxmagic = maxLife;
    }

    public int castLightningBolt() {
        if (currentmagic >= 5) {
            currentmagic = currentmagic - 5;
            return d.roll() + intelligence;
        } else {
            return 0;
        }
    }

    public int castHeal() {
        if (currentmagic >= 8) {
            currentmagic = currentmagic - 8;
            return d.roll() + intelligence;
        } else {
            return 0;
        }
    }

    public int getCurrentmagic() {
        return currentmagic;
    }

    public int getMaxmagic() {
        return maxmagic;
    }

}
