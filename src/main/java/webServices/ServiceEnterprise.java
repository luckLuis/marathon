package webServices;

import daos.DepartmentDAO;
import daos.Departments_employeesDAO;
import daos.EmployeeDAO;
import daos.EnterpriseDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import models.Department;
import models.Departments_employees;
import models.Employee;
import models.Enterprise;


@WebService(serviceName = "Service")
public class ServiceEnterprise {

    EnterpriseDAO dao = new EnterpriseDAO();    
    
    @WebMethod(operationName = "listar")
    public List<Enterprise> listar(){
        List datas = dao.listar();
        
        return datas;
    }
    
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "address") String addres, 
            @WebParam(name = "name") String name, 
            @WebParam(name = "phone") int phone){
        
        String datas = dao.add(addres, name, phone);
        
        return datas;
    }
    
    @WebMethod(operationName = "listarID")
    public Enterprise listarID(@WebParam(name = "id") int id){
        Enterprise enterprise = dao.listarID(id);
          
        return enterprise;
    }
    
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, 
            @WebParam(name = "addres") String addres, 
            @WebParam(name = "name") String name,
            @WebParam(name = "phone") int phone){
        
        String datos = dao.edit(id, addres, name, phone);
          
        return datos;
    }
    
    @WebMethod(operationName = "Eliminar")
    public Enterprise Eliminar(@WebParam(name = "id") int id){
        Enterprise ent = dao.delete(id);
        
        return ent;
    }
    
    
    //Employee
    
    EmployeeDAO daoEmp = new EmployeeDAO();

    @WebMethod(operationName = "listarEmpleados")
    public List<Employee> listarEmp() {
        List datas = daoEmp.listar();

        return datas;
    }

    @WebMethod(operationName = "agregarEmpleados")
    public String agregarEmpleados(@WebParam(name = "age") int age,
            @WebParam(name = "email") String email,
            @WebParam(name = "name") String name,
            @WebParam(name = "position") String position,
            @WebParam(name = "surname") String surname) {

        String datas = daoEmp.add(age, email, name, position, surname);

        return datas;
    }

    @WebMethod(operationName = "listarEmpleadosID")
    public Employee listarEmpleadosID(@WebParam(name = "id") int id) {
        Employee enterprise = daoEmp.listarID(id);

        return enterprise;
    }
    
    @WebMethod(operationName = "ActualizarEmpleados")
    public String ActualizarEmpleados(@WebParam(name = "id") int id, 
            @WebParam(name = "age") int age, 
            @WebParam(name = "email") String email,
            @WebParam(name = "name") String name,
            @WebParam(name = "position") String position,
            @WebParam(name = "surname") String surname){
        
        String datos = daoEmp.edit(id, age, email, name, position, surname);
          
        return datos;
    }
    
    
    //Department
    
    DepartmentDAO daoDepart = new DepartmentDAO();

    @WebMethod(operationName = "listarDepartamentos")
    public List<Department> listarDepart() {
        List datas = daoDepart.listarDepartamento();

        return datas;
    }
    
    @WebMethod(operationName = "agregarDepartamento")
    public String agregarDepartamento(@WebParam(name = "description") String description,
            @WebParam(name = "name") String name,
            @WebParam(name = "phone") int phone,
            @WebParam(name = "id_interprise") int id_interprise) {

        String datas = daoDepart.add(description, name, phone, id_interprise);

        return datas;
    }
    
    @WebMethod(operationName = "actualizarDepartamento")
    public String actualizarDepartamento(@WebParam(name = "id") int id, 
            @WebParam(name = "description") String description,
            @WebParam(name = "name") String name,
            @WebParam(name = "phone") int phone,
            @WebParam(name = "id_interprise") int id_interprise){
        
        String datos = daoDepart.edit(id, description, name, phone, id_interprise);
          
        return datos;
    }
    
    //Department_employee
    
    Departments_employeesDAO daoDepart_emp = new Departments_employeesDAO();

    @WebMethod(operationName = "listarDepartamentosEmpleados")
    public List<Departments_employees> listarDepart_emp() {
        List datas = daoDepart_emp.listar();

        return datas;
    }
    
    @WebMethod(operationName = "agregarEmpleadoDepartamento")
    public String agregarEmpleadoDepartamento(@WebParam(name = "id_employee") int id_employee,
            @WebParam(name = "id_department") int id_department) {

        String datas = daoDepart_emp.add(id_department, id_employee);

        return datas;
    }
    
    public String ActualizarEmpleados_departamento(@WebParam(name = "id") int id, 
            @WebParam(name = "id_employee") int id_employee, 
            @WebParam(name = "id_department") int id_department){
        
        String datos = daoDepart_emp.edit(id, id_department, id_employee);
          
        return datos;
    }
    
}
