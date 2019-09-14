package csce247.observer.trumpet;

import java.util.ArrayList;

public class Watchman implements Subject {
	private ArrayList<Observer> observers;
	private int blows;

	public Watchman() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(blows);
		}
	}

	public void issueWarning(int trumpet) {
		this.blows = trumpet;
		notifyObservers();
	}
}
