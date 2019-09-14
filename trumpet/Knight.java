package csce247.observer.trumpet;

public class Knight implements Observer {
    private int blows;
    private Subject knight;

    public Knight(Subject knight) {
        this.knight = knight;
        knight.registerObserver(this);
    }
//updates teacher, calls display
    public void update(int blow) {
        blows = blow;
        display();
    }
    //display knight response to trumpet blows
    public void display() {
        String s = "s";
        if (blows == 1) {
            s = "";
        }
        System.out.println("WARNING: " + blows + " trumpet" + s + " was played!");
        System.out.print("Knight: ");
        if (blows == 1) {
            System.out.println("Helps everyone get home safe");
        }
        if (blows == 2) {
            System.out.println("Prepares for battle");
        } else {
            System.out.println("i dunno man. prolly a party");
        }

    }
}
