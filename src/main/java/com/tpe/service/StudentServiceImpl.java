package com.tpe.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpe.domain.Student;
import com.tpe.exception.ResourceNotFoundException;
import com.tpe.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	//Field, Constructor, Setter

	@Autowired //Sadece bir constructor var ise Autowired koymaya gerek yok.
	public StudentServiceImpl( StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}


	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findStudents(String lastName) {
		//return studentRepository.findByLastName(lastName);
		return new ArrayList<Student>();
	}

	@Override
	public Student findStudent(Long id) throws ResourceNotFoundException {
//		Student student= studentRepository.findById(id);
//		if(student==null) {
//			throw new ResourceNotFoundException("Student not found with id:"+id);
//		}
//		return student;

		return null;
	}

	@Override
	public void createStudent(Student student) {
		//studentRepository.create(student);

	}

	@Override
	public void updateStudent(Student student) {
		//studentRepository.update(student);
	}

	@Override
	public void deleteStudent(Long id) {
		//studentRepository.delete(id);
	}

}