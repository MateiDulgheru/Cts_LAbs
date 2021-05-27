package ro.ase.cts.seminar13.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWrongValue;

class StudentTestCase {
	
	/*test fixtures*/
	Student student;
	String defaultName="Anonim";
	int defaultVarsta=18;
	int defaultNote[] = {}; 
	
	//student=new Student(defaultName,defaultVarsta,defaultNote);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
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
			student.setVarsta(-1);
	}

	
}
