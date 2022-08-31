package peaksoft.repository;

import peaksoft.entity.Company;

import java.util.List;


public interface CompanyRepository {

    void saveCompany(Company company);

    void updateCompany(Long id, Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);

    void countOfStudents();
}
