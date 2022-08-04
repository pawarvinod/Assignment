package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.modul.Test;

public interface TestRepo extends JpaRepository<Test, Integer> {

}
