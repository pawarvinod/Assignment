package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.modul.StudentTestAttempt;
@Repository
public interface StudentTestRepo extends JpaRepository<StudentTestAttempt, Integer> 
{

}
