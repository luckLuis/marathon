package interfaces;

import java.util.List;
import models.Enterprise;


public interface CRUDEnterprise {
    public List listar();
    public Enterprise listarID(int id);
    public String add(String addres, String name, int phone);
    public String edit(int id, String addres, String name, int phone);
    public Enterprise delete(int id);
}


