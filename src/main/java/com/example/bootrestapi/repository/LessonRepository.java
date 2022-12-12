package com.example.bootrestapi.repository;

import com.example.bootrestapi.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

    @Query("select l from Lesson l where l.course.id=:courseId ")
    List<Lesson> getAll(Long courseId);
}
