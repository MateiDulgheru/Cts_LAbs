package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;

class TestCaseStudent {
	
	static Student student;
	static String defaultName = "anonim";
	static int defaultVarsta = 18;
	static int defaultNote[];
	static int NR_NOTE_DEFAULT = 3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeClass was called...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownClass was called...");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called...");
		defaultNote = new int[NR_NOTE_DEFAULT];
		defaultNote[0] = 8;
		defaultNote[1] = 9;
		defaultNote[2] = 10;
		student = new Student(defaultName, defaultVarsta, defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("teadDown was called...");
	}
	
	//ordonance test
	@Test
	void testCalculMedieOrdonance() throws StudentExceptionWrongValue
	{
		//specific testului de ordonance este faptul ca inputul este
		//dat intr-o anumita ordine
		int note[]= {10,9,8,7,6};
		student.setNote(note);
		float medie=student.calculMedie();
		float expectedValue=8;
		assertEquals(expectedValue, medie,"Media nu corespunde");
	}
	
	//cardinality test - zero elemente
	@Test
	void testCalculMedieCardinalityZero()
	{
		int note[]= new int[3];
		
		try {
			student.setNote(note);
		} catch (StudentExceptionWrongValue e) {
			// TODO Auto-generated catch block
			fail("Exceptie generata de setNote");
		}
		
		
		
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
		
	}
	
	//cardinality test - 1 element
	@Tag("importante")	
	@Test
		void testCalculMedieCardinalityOne()
		{
			int note[]= new int[1];
			note[0]=9;
			
			try {
				student.setNote(note);
			} catch (StudentExceptionWrongValue e) {
				// TODO Auto-generated catch block
				fail("Exceptie generata de setNote");
			}
			
			
			
			assertThrows(StudentExceptionWrongValue.class, ()->{
				student.calculMedie();
			});
			
		}
	

}