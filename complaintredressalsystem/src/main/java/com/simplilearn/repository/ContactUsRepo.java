package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.ContactUs;


public interface ContactUsRepo extends JpaRepository<ContactUs, Integer>{

}
