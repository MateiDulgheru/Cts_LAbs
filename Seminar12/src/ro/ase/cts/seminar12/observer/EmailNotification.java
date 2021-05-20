package ro.ase.cts.seminar12.observer;

public class EmailNotification implements NotificationInterface{

	@Override
	public void notifyUser(double ammount) {
		// TODO Auto-generated method stub
		System.out.println("Sending email notification: "+ammount+" extracted");
		
	}

}
