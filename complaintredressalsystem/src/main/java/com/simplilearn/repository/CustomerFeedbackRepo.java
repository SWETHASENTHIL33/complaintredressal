package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.CustomerFeedback;

public interface CustomerFeedbackRepo extends JpaRepository<CustomerFeedback, Integer>{

}
