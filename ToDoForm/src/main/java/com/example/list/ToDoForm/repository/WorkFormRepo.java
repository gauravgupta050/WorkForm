package com.example.list.ToDoForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.list.ToDoForm.entity.WorkForm;

@Repository
public interface WorkFormRepo extends JpaRepository<WorkForm, Integer> {

}