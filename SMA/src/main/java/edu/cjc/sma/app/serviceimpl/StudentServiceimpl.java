package edu.cjc.sma.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sma.app.model.Student;
import edu.cjc.sma.app.repositary.StudentRepositary;
import edu.cjc.sma.app.servicei.StudentServiceI;

@Service
public class StudentServiceimpl implements StudentServiceI{
      
	@Autowired
	  StudentRepositary sr;

	@Override
	public void saveStudentDetails(Student st) {
		
		sr.save(st);
		
	}

	@Override
	public List<Student> getAllStudents() {
	
		return sr.findAll();
	}

	@Override
	public List<Student> getStudentByBatchNumber(String batchNumber) {
	
		return sr.findByBatchNumber(batchNumber);
	}

	@Override
	public Student editfees(int studentid) {	
		return sr.findById(studentid).get();
	}

	@Override
	public void feesUpdate(int studentId, double ammount) {
	
		Student s= sr.findById(studentId).get();
		double fees = Double.parseDouble(s.getFeesPaid());
		 double feespaid = (fees + ammount);
		   s.setFeesPaid(fees + " ");
		sr.save(s);
	}
	
	@Override
	public Student editBatch(int studentId) {
		
		return sr.findById(studentId).get();
		
	}


	@Override
	public void UpdateBatch(int studentId, String batchNumber,String batchMode) {	
		   Student s = sr.findById(studentId).get();
		   s.setBatchMode(batchMode);
		   s.setBatchNumber(batchNumber);
		   sr.save(s);
	}

	/*
	@Override
	public void DeleteStudent(int studentId) {
		
		sr.deleteByStudentId(studentId);
		
	}
	*/

	@Override
	public void DeleteStudent(int studentId) {
	sr.deleteById(studentId);
		
	}

	
	
	
	

	
}
