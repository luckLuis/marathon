
package mangedBean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import webservices.Enterprise;

import webservices.Service;

@Named(value = "staffManagedBean")
@SessionScoped
public class StaffManagedBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/backEnd/Service.wsdl")
    private Service service;

    public StaffManagedBean() {
    }
    
    
    public List<Enterprise> getEnterprise(){
        return loadEnterprise();
    }
    
    private java.util.List<webservices.Enterprise> loadEnterprise(){
    webservices.ServiceEnterprise port = service.getServiceEnterprisePort();
    // TODO process result here
    
    return port.listar();
    }
 
    
    public void seeEnterprise(Enterprise enterprise){
    System.out.println(enterprise.getId());
    System.out.println(enterprise.getName());
    }


}
