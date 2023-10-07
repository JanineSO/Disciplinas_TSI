package payRoll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import employee.Developer;
import employee.IEmployee;
import employee.Recruiter;
import employee.TeamLeader;

class PayrollTest {

	@Test
	void shouldReturnCorrectDeveloperSalary() {
		float hourlySalary = 40;
		float numberOfHours = 2;
		
		IEmployee employee = new Developer(); 
		
		float obtained = employee.calculateSalary(numberOfHours);
		
		float expected = numberOfHours * hourlySalary;
		
		assertEquals(expected, obtained);
	}
	
	//fazer para as outras três
	@Test
	void shoulReturnCorrectTeamLeaderSalary() {
		
		float hourlySalary = 32;
		float numberOfHours = 2;
		
		IEmployee employee = new TeamLeader();
		
		float obtained = employee.calculateSalary(numberOfHours);
		
		float expected = numberOfHours * hourlySalary;
		
		assertEquals(expected, obtained);
	}
	
	@Test
	void shoulReturnCorrectRecruiterSalaryWithouBonus() {
		
		
		float hourlySalary = 40;
		float numberOfHours = 2;

		
		
		IEmployee employee = new Recruiter();
		
		float obtained = employee.calculateSalary(numberOfHours);
		
		float expected = numberOfHours * hourlySalary;
		
		assertEquals(expected, obtained);
		
	}
	
	@Test
	
	void shoulReturnCorrectRecruiterSalaryWhitBonus() {
		float hourlySalary = 20;
		float numberOfHours = 101;
		float hireBonus = 500;
		
		
		IEmployee employee = new Recruiter();
		
		float obtained = employee.calculateSalary(numberOfHours);
		
		float expected = numberOfHours * hourlySalary + hireBonus;
		
		assertEquals(expected, obtained);
	}
	
	@Test
	void shouldCalculateCorrectSalaryOfAnyEmployee() {
		
		IEmployee employee[] = {new Developer(), new TeamLeader(), new Recruiter(), new Recruiter()};
		float hours[] = {2, 2, 2, 101};
		float expectedSalary[] = {80, 70, 40, 2520};
		
		for(int i = 0; i<employee.length; i++) {
			Payroll payroll = new Payroll(employee[i]);
			float expected = expectedSalary[i];
			float obtained = payroll.calculateSalary(hours[i]);
			assertEquals(expected, obtained);
		}
		
//		IEmployee employee = new Developer();
//		float expected = 80;
//		Payroll payroll = new Payroll(employee);
//		float obtained = payroll.calculateSalary(2);
//		assertEquals(expected, obtained);
//		
//		employee = new TeamLeader();
//		expected = 70;
//		payroll = new Payroll(employee);
//		obtained = payroll.calculateSalary(2);
//		assertEquals(expected, obtained);
//		
//		employee = new Recruiter();
//		expected = 40;
//		payroll = new Payroll(employee);
//		obtained = payroll.calculateSalary(2);
//		assertEquals(expected, obtained);
//		
//		employee = new Recruiter();
//		expected = 2520;
//		payroll = new Payroll(employee);
//		obtained = payroll.calculateSalary(101);
//		assertEquals(expected, obtained);
//		
	

}
	
}

