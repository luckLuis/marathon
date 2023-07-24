
package daos;

import interfaces.CRUDDepartments_employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Departments_employees;
import mysql.Conexion;


public class Departments_employeesDAO implements CRUDDepartments_employees{

    
    private static final String SQL_SELECT = "SELECT * FROM departments_employees";   
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM departments_employees WHERE id=";   
    private static final String SQL_INSERT = "INSERT INTO departments_employees (status, id_department, id_employee) VALUE (?, ?, ?)";    
    private static final String SQL_UPDATE = "UPDATE departments_employees SET id_department=?, id_employee=? WHERE id=";    
    private static final String SQL_DELETE = "DELETE FROM departments_employees WHERE id=";
    
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion connect = new Conexion();
    
    Statement st;
    
    int resp;
    String msg;
    
    Departments_employees depart_emp = new Departments_employees();
      
    
    
    @Override
    public List listar() {
        List<Departments_employees> datas = new ArrayList<>();
        
        
        try {            
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Departments_employees depart_emp = new Departments_employees();
                
                depart_emp.setId(rs.getInt("id"));
                 
                depart_emp.setCreated_by(rs.getString("created_by"));
                depart_emp.setCreated_date(rs.getString("created_date"));
                depart_emp.setModified_by(rs.getString("modified_by"));
                depart_emp.setModified_date(rs.getString("modified_date"));
                depart_emp.setId_department(rs.getInt("id_department"));
                
                datas.add(depart_emp);
            }
            
        } catch(Exception e){
        
        }
        
        return datas;
    }

    @Override
    public Departments_employees listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(int id_department, int id_employee) {
        
        boolean status = true;
        
        try {
        con = connect.getConnection();
        ps = con.prepareStatement(SQL_INSERT);
        ps.setBoolean(1, status);
        ps.setInt(2, id_department);
        ps.setInt(3, id_employee);
        
        resp = ps.executeUpdate();
        if(resp==1){
            msg = "Successfully added!";
        } else {
            msg = "Error";
        }
        } catch(Exception e){
        
        }
        
        return msg;
    }

    @Override
    public String edit(int id, int id_department, int id_employee) {
        String UPDATE = SQL_UPDATE + id;

        try {
            con = connect.getConnection();
            ps = con.prepareStatement(UPDATE);
            ps.setInt(1, id_department);
            ps.setInt(2, id_employee);

            resp = ps.executeUpdate();

            if (resp == 1) {
                msg = "Updated successfully!";
            } else {
                msg = "Error!";
            }

        } catch (Exception e) {

        }

        return msg;
    }

    @Override
    public Departments_employees delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
