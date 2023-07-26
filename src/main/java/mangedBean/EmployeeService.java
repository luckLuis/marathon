/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangedBean;

/**
 *
 * @author jacom
 */
public class EmployeeService {

    public EmployeeService() {
    }
    
    
    
    public java.util.List<webservices.Employee> listar(){
        webservices.Service service = new webservices.Service();
        webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
        
        return port.listarEmpleados();
    }
    
}
