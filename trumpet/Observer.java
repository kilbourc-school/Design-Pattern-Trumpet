package csce247.observer.trumpet;

public interface Observer {
    //forces all observers to implement update
    public void update(int blows);
}
