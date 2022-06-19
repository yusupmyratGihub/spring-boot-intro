package com.tpe.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpe.domain.Student;
import com.tpe.exception.ConflictException;

@Repository

//Repository interface
//CRUDRepository-CRUD Operasyonları
//JPARepository-->CRUD + PagingAndSortingRepository
//PagingAndSortingRepository-->Paging ve Sorting
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByLastName(String lastName);

    Boolean existsByEmail(String email) throws ConflictException;

}