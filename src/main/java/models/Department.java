package models;

public class Department {

    int id;
    String created_by;
    String created_date;
    String modified_by;
    String modified_date;
    boolean status;
    String description;
    String name;
    int phone;
    int id_enterprise;

    public Department() {
    }

    public Department(int id, String created_by, String modified_by, 
            boolean status, String description, String name, 
            int phone, int id_enterprise) {
        this.id = id;
        this.created_by = created_by;
        this.modified_by = modified_by;
        this.status = status;
        this.description = description;
        this.name = name;
        this.phone = phone;
        this.id_enterprise = id_enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId_enterprise() {
        return id_enterprise;
    }

    public void setId_enterprise(int id_enterprise) {
        this.id_enterprise = id_enterprise;
    }
    
}
