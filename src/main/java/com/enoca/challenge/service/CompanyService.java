package com.enoca.challenge.service;

import com.enoca.challenge.model.Company;
import com.enoca.challenge.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Long companyId, Company updatedCompany) {
        Company existingCompany = companyRepository.findById(companyId).orElse(null);

        if (existingCompany != null) {
            existingCompany.setName(updatedCompany.getName());
            return companyRepository.save(existingCompany);
        }

        return null;
    }

    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }
}
