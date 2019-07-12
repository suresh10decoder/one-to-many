package com.many.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.one.model.College;
@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {

}
