package observer;

public interface Observer {
	void update(Subject s);
}

class ObserverA implements Observer{

	private int myState;
	
	@Override
	public void update(Subject s) {
		myState = ((ConcreteSubject)s).getState();
		
	}
	public int getMystate() {
		return myState;
	}
	
}
