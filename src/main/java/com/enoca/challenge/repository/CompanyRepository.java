package com.enoca.challenge.repository;

import com.enoca.challenge.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
