package com.yash.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.modul.Teacher;
@Repository
public interface TecherRepo extends JpaRepository<Teacher, Integer>
{

}
