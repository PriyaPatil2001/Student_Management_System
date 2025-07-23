package edu.cjc.sma.app.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.cjc.sma.app.model.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>{
	
	public List<Student> findByBatchNumber(String batchNumber);
	
	//@Transactional
	//public void deleteByStudentId(int StudentId);
	
	
	 
}
