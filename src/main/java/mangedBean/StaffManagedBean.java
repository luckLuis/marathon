package mangedBean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import webservices.Department;
import webservices.DepartmentsEmployees;
import webservices.Employee;
import webservices.Enterprise;

import webservices.Service;

@Named(value = "staffManagedBean")
@SessionScoped
public class StaffManagedBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/backEnd/Service.wsdl")
    private Service service;

    public StaffManagedBean() {
    }

    public List<Enterprise> getEnterprise() {
        return loadEnterprise();
    }

    private java.util.List<webservices.Enterprise> loadEnterprise() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listar();
    }

    public String addEnterprise(java.lang.String addres, java.lang.String name,
            java.lang.Integer phone) {
        
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();

        return port.agregar(addres, name, phone);
    }
    
    public String enviarDatos(){
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
 
        return "asd";
    }
    
    
    //Employees
    public List<Employee> getEmployee() {
        return loadEmployee();
    }

    private java.util.List<webservices.Employee> loadEmployee() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarEmpleados();
    }
    
    
    
    
    //Departments
    public List<Department> getDepartment() {
        return loadDepartment();
    }

    private java.util.List<webservices.Department> loadDepartment() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarDepartamentos();
    }
    
    
    
    //EmployessForDepartments
    public List<DepartmentsEmployees> getEmployessForDepartments() {
        return loadEmployessForDepartments();
    }

    private java.util.List<webservices.DepartmentsEmployees> loadEmployessForDepartments() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarDepartamentosEmpleados();
    }

}
