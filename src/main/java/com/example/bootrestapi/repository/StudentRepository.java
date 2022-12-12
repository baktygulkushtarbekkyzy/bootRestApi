package com.example.bootrestapi.repository;

import com.example.bootrestapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long  > {

    @Query("select s from Student s where s.group.id=:groupId")
    List<Student> getAll(Long groupId);
}
