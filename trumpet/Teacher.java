package csce247.observer.trumpet;

public class Teacher implements Observer {
    private int blows;
    private Subject teacher;

    public Teacher(Subject teacher) {
        this.teacher = teacher;
        teacher.registerObserver(this);
    }

//updates teacher, calls display

    public void update(int blow) {
        blows = blow;
        display();
    }

    //display teacher response to trumpet blows
    public void display() {
        String s = "s";
        if (blows == 1) {
            s = "";
        }
        System.out.println("WARNING: " + blows + " trumpet" + s + " was played!");
        System.out.print("Teacher: ");
        if (blows == 1) {
            System.out.println("Helps get every kid home safe");
        }
        if (blows == 2) {
            System.out.println("Drops everything and find nearest hideout");
        } else {
            System.out.println("i dunno man. prolly a party");
        }

    }
}
