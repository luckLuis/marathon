package daos;

import interfaces.CRUDDepartment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Department;
import mysql.Conexion;

public class DepartmentDAO implements CRUDDepartment {

    private static final String SQL_SELECT = "SELECT * FROM departments";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM departments WHERE id=";
    private static final String SQL_INSERT = "INSERT INTO departments (description, name, phone, id_enterprise) VALUE (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE departments SET description=?, name=?, phone=? , id_enterprise=? WHERE id=";
    private static final String SQL_DELETE = "DELETE FROM departments WHERE id=";

    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion connect = new Conexion();
    
    Statement st;
    
    int resp;
    String msg;
    
    Department enterprise = new Department();
      
    
    @Override
    public List listarDepartamento() {
        
        List<Department> datas = new ArrayList<>();
        
        
        try {            
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Department depart = new Department();
                
                depart.setId(rs.getInt("id"));
                 
                depart.setCreated_by(rs.getString("created_by"));
                depart.setCreated_date(rs.getString("created_date"));
                depart.setModified_by(rs.getString("modified_by"));
                depart.setModified_date(rs.getString("modified_date"));
                
                depart.setDescription(rs.getString("description"));
                depart.setName(rs.getString("name"));
                depart.setPhone(rs.getInt("phone"));
                depart.setId_enterprise(rs.getInt("id_enterprise"));
               
                
                datas.add(depart);
            }
            
        } catch(Exception e){
        
        }
        
        return datas;
    }

    @Override
    public Department listarDepartamentoID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(String description, String name, int phone, int id_interprise) {
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, description);
            ps.setString(2, name);
            ps.setInt(3, phone);
            ps.setInt(4, id_interprise);
            
            resp = ps.executeUpdate();
            if (resp == 1) {
                msg = "Successfully added!";
            } else {
                msg = "Error";
            }
        } catch (Exception e) {

        }

        return msg;
    }

    @Override
    public String edit(int id, String description, String name, int phone, int id_interprise) {
    String UPDATE = SQL_UPDATE + id;

        try {
            con = connect.getConnection();
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, description);
            ps.setString(2, name);
            ps.setInt(3, phone);
            ps.setInt(4, id_interprise);
            

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
    public Department delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
