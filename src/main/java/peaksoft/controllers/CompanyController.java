package peaksoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entity.Company;
import peaksoft.service.CompanyService;


@Controller
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


    @GetMapping("/new")
    private String newCompany(Model model) {
        model.addAttribute("newCompany", new Company());
        return "company/newCompany";
    }

    @PostMapping("/save")
    private String saveCompany(@ModelAttribute("newCompany") Company company) {
        companyService.saveCompany(company);
        return "redirect:/companies/allCompanies";
    }

    @GetMapping("/allCompanies")
    private String getAllCompanies(Model model) {
        model.addAttribute("allCompanies", companyService.getAllCompanies());
        return "company/mainCompany";
    }

    @GetMapping("/getCompany/{id}")
    private String getCompanyById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("company", companyService.getCompanyById(id));
        return "company/mainCompany";

    }

    @GetMapping("/update/{id}")
    private String updateCompany(@PathVariable("id") Long id, Model model) {
        model.addAttribute("company", companyService.getCompanyById(id));
        return "company/updateCompany";
    }


    @PatchMapping("{id}/updateCompany")
    private String saveUpdateCompany(@PathVariable("id") Long id,
                                     @ModelAttribute("company") Company company) {
        companyService.updateCompany(id, company);
        return "redirect:/companies/allCompanies";
    }


    @DeleteMapping("/delete/{id}")
    public String deleteCompany(@PathVariable("id") Long id) {
        companyService.deleteCompanyById(id);
        return "redirect:/companies/allCompanies";
    }
}