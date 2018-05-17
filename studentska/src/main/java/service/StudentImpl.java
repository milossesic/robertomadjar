package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.StudentDTO;
import repository.StudentRepository;
import service.interfaces.IStudent;

@Service
public class StudentImpl implements IStudent{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentDTO> listAllStudents() {
		
		return (List<StudentDTO>) studentRepository;
	}

}
