package com.example.jobapp.company.service;
import com.example.jobapp.company.model.Company;
import java.util.List;

public interface CompanyService {
    List<Company> getAll();
    boolean update(Company updatedCompany, Long id);
    void create(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
