package ro.ase.cts.seminar12.observer;

public class SmsNotification implements NotificationInterface{

	@Override
	public void notifyUser(double ammount) {
		System.out.println("Notify user by sms: "+ammount+" extracted");
		
	}

}
