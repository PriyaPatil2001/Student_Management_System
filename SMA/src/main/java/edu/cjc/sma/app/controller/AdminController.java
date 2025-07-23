 package edu.cjc.sma.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sma.app.model.Student;
import edu.cjc.sma.app.servicei.StudentServiceI;

@Controller
public class AdminController {
	
	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String preLogin() {
		
		  return "login";
	}
	
	@RequestMapping("/login")
	public String onlogin(@RequestParam String username,@RequestParam String password,Model m) {
		if(username.equals("admin") && password.equals("admin123")) {
			
			List<Student> lists = ssi.getAllStudents();
			m.addAttribute("data" ,lists);
			return "adminscreen";
		}
		else {
			return "login";
		}

	}
	
	@RequestMapping("enroll_student")
	public String onlogin(@ModelAttribute Student student) {
		
		ssi.saveStudentDetails(student);
		return "adminscreen";
	}
	
	@RequestMapping("/search")
	public String getStudentByBatch(@RequestParam("batchNumber") String batchNumber,Model m) {
		  List<Student> list=ssi.getStudentByBatchNumber(batchNumber);
		  m.addAttribute("data", list);
		  return "adminscreen";
		 
	}
	
	@RequestMapping("/fees")
	public String editfees(@RequestParam("studentId") int studentId,Model m) {
		Student stu=ssi.editfees(studentId);
		m.addAttribute("st",stu);
		return "fees";
	}
	
	@RequestMapping("/payfees")
	public String OnPayFees(@RequestParam("studentid") int studentId,@RequestParam("ammount")double ammount ,Model m) {
		ssi.feesUpdate(studentId, ammount);
		List<Student> list = ssi.getAllStudents();
		m.addAttribute("data", list);
		return "adminscreen";
	}
	
	@RequestMapping("/shiftbatch")
	public String editBatch(@RequestParam("studentId") int studentId,Model m) {		
		Student stu = ssi.editBatch(studentId);
		m.addAttribute("st", stu);
		return "shiftbatch";
	}
	
	@RequestMapping("/shiftbatchform")
	public String OnshiftBatch(@RequestParam("studentId") int studentId,@RequestParam("batchNumber") String batchNumber,@RequestParam("batchMode")String batchMode, Model m) {		
		 ssi.UpdateBatch(studentId, batchNumber, batchMode);
		 List<Student> list = ssi.getAllStudents();
		 m.addAttribute("data", list);
		 return "adminscreen";
		
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int studentId,Model m) {
		
		  ssi.DeleteStudent(studentId);
		  List<Student> list = ssi.getAllStudents();
		  m.addAttribute("data", list);
		  return "adminscreen";
	}
	

	
}
