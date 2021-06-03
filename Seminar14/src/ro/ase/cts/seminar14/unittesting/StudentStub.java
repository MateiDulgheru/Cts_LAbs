package ro.ase.cts.seminar14.unittesting;

import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;

public class StudentStub extends StudentAbstract{

	float calculMedieReturnValue=0;
	boolean exceptionalCase=false;
	
	
	
	
	
	public void setExceptionalCase(boolean exceptionalCase) {
		this.exceptionalCase = exceptionalCase;
	}



	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}



	@Override
	public float calculMedie() throws StudentExceptionWrongValue {
		// TODO Auto-generated method stub
		if(exceptionalCase)
			throw new StudentExceptionWrongValue("exceptie calcul medie");
		return calculMedieReturnValue;
	}

}
