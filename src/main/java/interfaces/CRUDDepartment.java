
package interfaces;

import java.util.List;
import models.Department;


public interface CRUDDepartment {
    
    public List listarDepartamento();
    public Department listarDepartamentoID(int id);
    public String add(String description, String name, int phone, int id_interprise);
    public String edit(int id, String description, String name, int phone, int id_interprise);
    public Department delete(int id);
    
}
