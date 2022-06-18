package com.tpe.repository;

import com.tpe.domain.Student;
import com.tpe.exception.ConflictException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//CRUDrepository     ->crud operasyonlari icin
//JPArepository      ->PagingAndSortingRepository+crud
//PagingAndSortingRepository  ->paging and sorting
public interface StudentRepository extends JpaRepository<Student,Long> {


    List<Student> findByLastName(String lastName);
    Boolean existsByEmail(String email) throws ConflictException;

}
