package model;

import java.util.*;
import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Contact {


@Id @Hidden
@GeneratedValue ( strategy = GenerationType. IDENTITY )
    @Column(name = "id", nullable = true)
    private Integer id;

    @Column(name = "companyName", length = 40, nullable = true)
    private String companyname;

    @Column(name = "created_by", length = 40, nullable = true)
    private String created_by;

    @Column(name = "email", length = 40, nullable = true)
    private String email;

    @Column(name = "information", length = 40, nullable = true)
    private String information;

    @Column(name = "name", length = 40, nullable = true)
    private String name;

    @Column(name = "phone", length = 12, nullable = true)
    private String phone;

    @Column(name = "updated_by", length = 40, nullable = true)
    private String updated_by;

    public void setId(Integer aValue) {
        id = aValue;
    }

    public Integer getId() {
        return id;
    }

    public void setCompanyname(String aValue) {
        companyname = aValue;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCreated_by(String aValue) {
        created_by = aValue;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setEmail(String aValue) {
        email = aValue;
    }

    public String getEmail() {
        return email;
    }

    public void setInformation(String aValue) {
        information = aValue;
    }

    public String getInformation() {
        return information;
    }

    public void setName(String aValue) {
        name = aValue;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String aValue) {
        phone = aValue;
    }

    public String getPhone() {
        return phone;
    }

    public void setUpdated_by(String aValue) {
        updated_by = aValue;
    }

    public String getUpdated_by() {
        return updated_by;
    }
}
