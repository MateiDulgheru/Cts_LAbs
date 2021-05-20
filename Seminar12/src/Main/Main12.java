package Main;

import java.util.ArrayList;

import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.BankAccount;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.EmailNotification;
import ro.ase.cts.seminar12.observer.InsuficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SmsNotification;

public class Main12 {

	public static void main(String[] args) {
		
		CreditAccount account = new CreditAccount(1000,"codIban");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double ammount) {
				System.out.println("[inline example]: "+ammount+" extracted");
				
			}
		});
		
		NotificationInterface smsNotificationService = new SmsNotification();
		NotificationInterface emailNotificationService = new EmailNotification();
		
		account.addObserver(smsNotificationService);
		account.addObserver(emailNotificationService);
		
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------");
		ArrayList<CharacterMemento> saveList=new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Alex", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
		

	}

}
