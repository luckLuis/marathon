
package interfaces;

import java.util.List;
import models.Departments_employees;


public interface CRUDDepartments_employees {
    
    public List listar();
    public Departments_employees listarID(int id);
    public String add(int id_department, int id_employee);
    public String edit(int id, int id_department, int id_employee);
    public Departments_employees delete(int id);
    
}
