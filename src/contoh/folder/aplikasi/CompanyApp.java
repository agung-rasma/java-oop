package contoh.folder.aplikasi;

import contoh.folder.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Wasundara");

        Company.Employee employee = company.new Employee();
        employee.setName("Agung");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Nothing");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Wayan");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
