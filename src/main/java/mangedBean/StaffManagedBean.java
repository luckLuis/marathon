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

    int id;
    
    
    private String addres;
    private String name;
    private int phone;
    
    
    private int age;
    private String email;
    private String position;
    private String surname;
    
    
    private String description;
    private int id_interprise;
    private int id_employee;
    private int id_department;

    // Getters y setters para las propiedades

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_interprise() {
        return id_interprise;
    }

    public void setId_interprise(int id_interprise) {
        this.id_interprise = id_interprise;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    
    
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/backEnd/Service.wsdl")
    private Service service;

    public StaffManagedBean() {
    }

    public List<Enterprise> getEnterprise() {
        return loadEnterprise();
    }

    private java.util.List<webservices.Enterprise> loadEnterprise() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarEmpresas();
    }

    public void addEnterprise() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.agregarEmpresa(addres, name, phone);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    
    public void editEnterprise() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.actualizarEmpresa(id, addres, name, phone);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    
    
    
    //Employees
    public List<Employee> getEmployee() {
        return loadEmployee();
    }

    private java.util.List<webservices.Employee> loadEmployee() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarEmpleados();
    }
    
    public void addEmployee() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.agregarEmpleados(age, email, name, position, surname);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    
    public void editEmployee() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.actualizarEmpleados(id, age, email, name, position, surname);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }

    //Departments
    public List<Department> getDepartment() {
        return loadDepartment();
    }

    private java.util.List<webservices.Department> loadDepartment() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarDepartamentos();
    }
    
    public void addDepartment() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.agregarDepartamento(description, name, phone, id_interprise);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    
    public void editDepartment() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.actualizarDepartamento(id, description, name, phone, id_interprise);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    

    //EmployessForDepartments
    public List<DepartmentsEmployees> getEmployessForDepartments() {
        return loadEmployessForDepartments();
    }

    private java.util.List<webservices.DepartmentsEmployees> loadEmployessForDepartments() {
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        return port.listarDepartamentosEmpleados();
    }
    
    public void addEmployeeForDepartment() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.agregarEmpleadoDepartamento(id_employee, id_department);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    
    public void editEmployeeForDepartment() {
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // Llama al método web y envía los datos
    String response = port.actualizarEmpleadosDepartamento(id, id_employee, id_department);
    // Procesa la respuesta (puedes mostrarla en un mensaje o redirigir a otra página)
    System.out.println("Respuesta del método web: " + response);
    }
    

    public static void main(String[] args) {

        EmployeeService enter = new EmployeeService();
        List<Employee> datos = enter.listar();

        System.out.println(datos);

        for (Employee sf : datos) {
            System.out.println(sf.getId() + "  " + sf.getName());
        }

    }

}
