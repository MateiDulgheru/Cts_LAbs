package ro.ase.cts.seminar10.command;

public class RemoteControl {
	
	CommandInterface lightOnCommand;
	CommandInterface lightOffCommand;
	CommandInterface dimLightCommand;
	CommandInterface increaseIntensityCommand;
	
	public RemoteControl(CommandInterface lightOnCommand, CommandInterface lightOffCommand,
			CommandInterface dimLightCommand, CommandInterface increaseIntensityCommand) {
		super();
		this.lightOnCommand = lightOnCommand;
		this.lightOffCommand = lightOffCommand;
		this.dimLightCommand = dimLightCommand;
		this.increaseIntensityCommand = increaseIntensityCommand;
	}
	
	public void pressLightOnButton() {
		lightOnCommand.execute();
	}
	
	public void pressLightOffButton() {
		lightOffCommand.execute();
	}
	
	public void pressDimLightButton() {
		dimLightCommand.execute();
	}
	
	public void pressIncreaseLightButton() {
		increaseIntensityCommand.execute();
	}

}
