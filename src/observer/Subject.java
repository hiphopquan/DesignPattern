package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<Observer>();
	
	public void add(Observer obs) {
		list.add(obs);
	}
	public void remove(Observer obs) {
		list.add(obs);
	}
	public void notifyAllObservers() {
		for(Observer obs : list) {
			obs.update(this);
		}
	}	
}
