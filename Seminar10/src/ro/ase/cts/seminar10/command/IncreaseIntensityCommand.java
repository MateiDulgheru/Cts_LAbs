package ro.ase.cts.seminar10.command;

public class IncreaseIntensityCommand implements CommandInterface{

	
private LightBulb lightBulb;
	
	
	
	public IncreaseIntensityCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	
	


	
	@Override
	public void execute() {
		lightBulb.increaseLightIntensity();
		// TODO Auto-generated method stub
		
	}

}
