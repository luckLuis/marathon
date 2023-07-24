package interfaces;

import java.util.List;
import models.Employee;

public interface CRUDEmployee {
    
    public List listar();
    public Employee listarID(int id);
    public String add(int age, String email, String name, String position, String surname);
    public String edit(int id, int age, String email, String name, String position, String surname);
    public Employee delete(int id);
       
}
