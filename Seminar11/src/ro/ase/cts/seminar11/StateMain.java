package ro.ase.cts.seminar11;

import ro.ase.cts.seminar11.state.Gate;

public class StateMain {
	
	public static void main(String[] args)
	{
		Gate securedGate=new Gate();
		securedGate.authorize();
		securedGate.enter();
	}

	
	
}
