
package mangedBean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "controller")
@SessionScoped
public class navegatePage implements Serializable{
    
    
    private String nextPage;

    public navegatePage() {
    }
    
    public String enterprisePage(){
        return "enterprisePage";
    }
    
    public String employeePage(){
        return "employeePage";
    }
    
    public String departmentPage(){
        return "departmentPage";
    }
    
    public String departmentsEmployeesPage(){
        return "departmentsEmployees";
    }
}
