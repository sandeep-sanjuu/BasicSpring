package com.example.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.customerEntity;
@Repository
public interface customerRepository extends JpaRepository<customerEntity,Integer>{

}
