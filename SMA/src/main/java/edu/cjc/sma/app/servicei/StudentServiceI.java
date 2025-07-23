package edu.cjc.sma.app.servicei;

import java.util.List;

import edu.cjc.sma.app.model.Student;

public interface StudentServiceI {
	
	  public void saveStudentDetails(Student st);
	  public List<Student> getAllStudents();
	  public List<Student> getStudentByBatchNumber(String batchNumber);
	  public Student editfees(int studentid);
	  public void feesUpdate(int studentId, double ammount);
	  public Student editBatch(int studentId);
	  public void UpdateBatch(int studentId,String batchNumber ,String batchMode);
	  public void DeleteStudent(int studentId);
	

	 
	
	 

	  

}
