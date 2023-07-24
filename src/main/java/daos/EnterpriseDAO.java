package daos;


import mysql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Enterprise;
import interfaces.CRUDEnterprise;




public class EnterpriseDAO implements CRUDEnterprise{
   
    private static final String SQL_SELECT = "SELECT * FROM enterprises";   
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM enterprises WHERE id=";   
    private static final String SQL_INSERT = "INSERT INTO enterprises (addres, name, phone) VALUE (?, ?, ?)";    
    private static final String SQL_UPDATE = "UPDATE enterprises SET addres=?, name=?, phone=? WHERE id=";    
    private static final String SQL_DELETE = "DELETE FROM enterprises WHERE id=";
    
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion connect = new Conexion();
    
    Statement st;
    
    int resp;
    String msg;
    
    Enterprise enterprise = new Enterprise();
      
    
    
    @Override
    public List listar() {
        
        List<Enterprise> datas = new ArrayList<>();
        
        
        try {            
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Enterprise ent = new Enterprise();
                
                ent.setId(rs.getInt("id"));
                 
                ent.setCreated_by(rs.getString("created_by"));
                ent.setCreated_date(rs.getString("created_date"));
                ent.setModified_by(rs.getString("modified_by"));
                ent.setModified_date(rs.getString("modified_date"));
                
                ent.setAddres(rs.getString("addres"));
                ent.setName(rs.getString("name"));
                ent.setPhone(rs.getInt("phone"));
               
                
                datas.add(ent);
            }
            
        } catch(Exception e){
        
        }
        
        return datas;
    }

    @Override
    public Enterprise listarID(int id) {
        String LISTAR_ID = SQL_SELECT_BY_ID + id;
        
                
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(LISTAR_ID);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Enterprise ent = new Enterprise();
                enterprise.setId(rs.getInt("id"));
                
                enterprise.setCreated_by(rs.getString("created_by"));
                enterprise.setCreated_date(rs.getString("created_date"));
                enterprise.setModified_by(rs.getString("modified_by"));
                enterprise.setModified_date(rs.getString("modified_date"));
                           
                enterprise.setAddres(rs.getString("addres"));
                enterprise.setName(rs.getString("name"));
                enterprise.setPhone(rs.getInt("phone"));                      
            }
            
        } catch(Exception e){
        
        }
        
        return enterprise;
    }

    
    @Override
    public String add(String addres, String name, int phone) {
        
        try {
        con = connect.getConnection();
        ps = con.prepareStatement(SQL_INSERT);
        ps.setString(1, addres);
        ps.setString(2, name);
        ps.setInt(3, phone);
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
    public String edit(int id, String addres, String name, int phone) {
        
        String UPDATE = SQL_UPDATE + id;
        
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, name);
            ps.setString(2, addres);
            ps.setInt(3, phone);
            
            resp = ps.executeUpdate();
            
            if(resp == 1) {
                msg = "Updated successfully!";
            } else {
                msg = "Error!";
            }
            
        } catch(Exception e){
        
        }
        
        return msg;
    }

    @Override
    public Enterprise delete(int id) {
        String DELETE = SQL_DELETE + id;
        
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(DELETE);
            ps.executeUpdate();
            
        } catch (Exception e){
        
        }
               
        return enterprise;
    }
  
}
