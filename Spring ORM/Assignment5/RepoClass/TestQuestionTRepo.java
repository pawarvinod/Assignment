package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.modul.TestQustion;
@Repository
public interface TestQuestionTRepo extends JpaRepository<TestQustion, Integer> {

}
