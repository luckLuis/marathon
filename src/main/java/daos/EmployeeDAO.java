package daos;

import interfaces.CRUDEmployee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Employee;
import mysql.Conexion;


public class EmployeeDAO implements CRUDEmployee {

    private static final String SQL_SELECT = "SELECT * FROM employees";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM employees WHERE id=";
    private static final String SQL_INSERT = "INSERT INTO employees (age, email, name, position, surname) VALUE (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE employees SET age=?, email=?, name=?, position=?, surname=? WHERE id=";
    private static final String SQL_DELETE = "DELETE FROM employees WHERE id=";

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion connect = new Conexion();

    Statement st;

    int resp;
    String msg;

    Employee employee = new Employee();

    @Override
    public List listar() {
        List<Employee> datas = new ArrayList<>();

        try {
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));

                emp.setCreated_by(rs.getString("created_by"));
                emp.setCreated_date(rs.getString("created_date"));
                emp.setModified_by(rs.getString("modified_by"));
                emp.setModified_date(rs.getString("modified_date"));

                emp.setAge(rs.getInt("age"));
                emp.setEmail(rs.getString("email"));
                emp.setName(rs.getString("name"));
                emp.setPosition(rs.getString("position"));
                emp.setSurname(rs.getString("surname"));

                datas.add(emp);
            }

        } catch (Exception e) {

        }

        return datas;

    }

    @Override
    public Employee listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(int age, String email, String name, String position, String surname) {
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, age);
            ps.setString(2, email);
            ps.setString(3, name);
            ps.setString(4, position);
            ps.setString(5, surname);
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
    public String edit(int id, int age, String email, String name, String position, String surname) {
        String UPDATE = SQL_UPDATE + id;

        try {
            con = connect.getConnection();
            ps = con.prepareStatement(UPDATE);
            ps.setInt(1, age);
            ps.setString(2, email);
            ps.setString(3, name);
            ps.setString(4, position);
            ps.setString(5, surname);

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
    public Employee delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
