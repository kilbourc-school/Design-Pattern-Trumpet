package csce247.observer.trumpet;

public class ShopOwner implements Observer {
    private int blows;
    private Subject shopowner;

    public ShopOwner(Subject shopowner) {
        this.shopowner = shopowner;
        shopowner.registerObserver(this);
    }
//updates shop owner, calls display
    public void update(int blow) {
        blows = blow;
        display();
    }
    //display shop owner response to trumpet blows
    public void display() {
        String s = "s";
        if (blows == 1) {
            s = "";
        }
        System.out.println("WARNING: " + blows + " trumpet" + s + " was played!");
System.out.print("Shop Owner: ");
        if (blows == 1) {
            System.out.println("Close down shop and head home");
        }
        if (blows == 2) {
            System.out.println("Drops everything and find nearest hideout");
        } else {
            System.out.println("i dunno man. prolly a party");
        }

    }
}
