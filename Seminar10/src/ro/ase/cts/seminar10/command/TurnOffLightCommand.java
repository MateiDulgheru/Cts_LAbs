package ro.ase.cts.seminar10.command;

public class TurnOffLightCommand implements CommandInterface{

	private LightBulb lightBulb;
	
	
	
	public TurnOffLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	
	


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightBulb.turnOffLight();
		
	}

}
