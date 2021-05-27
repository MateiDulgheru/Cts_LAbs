package ro.ase.cts.seminar13.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import javax.sound.midi.InvalidMidiDataException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWrongValue;
import org.junit.jupiter.api.function.Executable;

class StudentTestCase {
	
	/*test fixtures*/
	Student student;
	static String DEFAULT_NAME="Anonim";
	static int DEFAULT_VARSTA=18;
	static int DEFAULT_NOTE[] = {}; 
	static int NR_NOTE_DEFAULT=3;
	
	//student=new Student(defaultName,defaultVarsta,defaultNote);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
		DEFAULT_NOTE=new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0]=9;
		DEFAULT_NOTE[1]=9;
		DEFAULT_NOTE[2]=10;
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student(DEFAULT_NAME,DEFAULT_VARSTA,DEFAULT_NOTE);
		System.out.println("setUp was called");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}
	

	/* right/conformance test*/
	@Test
	void testStudentConstrcutorRight() {
		
		String studentName="Alex";
		int studentAge=27;
		int grades[]= {8,8,9};
		
		Student student=new Student(studentName, studentAge, grades);
		/*if(!student.nume.equals(studentName))
		{
			fail("Name is not equal");
		}*/
		
		assertEquals(studentName, student.getNume(),"Name is not equal");
		assertEquals(studentAge, student.getVarsta(),"Age is not equal");
		assertEquals(grades, student.getNote(),"Grades are not equal");
		
	}

	@Test
	void testStudentConstructorRightNotNull()
	{
		int grades[]= {8,8,9};
		Student student=null;
		try {
			student = new Student("Alex", 27, grades);
		} catch (Exception e) {
			fail("Constructorul nu trebuie sa dea exceptii!");
		}
		assertNotNull(student);
	}
	
	
	
	@Test
	void testStudentSetVarstaErrorCondition() {
			/*assertThrows(StudentExceptionWrongValue.class, ()->{
				student.setVarsta(-1);
			});*/
		
		assertThrows(StudentExceptionWrongValue.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				student.setVarsta(-1);
				
			}
	});
	}

	@Test
	void testStudentGetVarstaRight()
	{
		int expectedValue = DEFAULT_VARSTA;
		int actualValue=student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testCalculMedieErrorCondition()
	{
		try {
			student.setNote(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
	}
	
	@Test
	void testCalculMedieRightDouaZecimale() throws StudentExceptionWrongValue{
		
		float expectedValue = 9.33f;
		float actualValue=student.calculMedie();
		assertEquals(expectedValue, actualValue);
	}
	
	//boundary check
	@Test
	void testSetNoteBoundaryCondition()
	{
		int invalidDataSetNote[]=new int[3];
		for(int i=0; i<2; i++)
		{
			invalidDataSetNote[i]=8;
		}
		invalidDataSetNote[2]=20;
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.setNote(invalidDataSetNote);
		});
	}
}
