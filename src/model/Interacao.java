package model;

import java.util.*;
import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Interacao {

    @Id
    @Required
    @Column(name = "id", nullable = true)
    private Integer id;

    @Column(name = "assunto", length = 100, nullable = true)
    private String assunto;

    @Column(name = "created_by", length = 100, nullable = true)
    private String created_by;

    @Column(name = "data", nullable = true)
    private java.sql.Timestamp data;

    @Column(name = "departamento", length = 100, nullable = true)
    private String departamento;

   
    @Column(name = "resultado", length = 100, nullable = true)
    private String resultado;

    @Column(name = "tipo", length = 40, nullable = true)
    private String tipo;

    @Column(name = "updated_by", length = 100, nullable = true)
    private String updated_by;

    public void setId(Integer aValue) {
        id = aValue;
    }

    public Integer getId() {
        return id;
    }

    public void setAssunto(String aValue) {
        assunto = aValue;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setCreated_by(String aValue) {
        created_by = aValue;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setData(java.sql.Timestamp aValue) {
        data = aValue;
    }

    public java.sql.Timestamp getData() {
        return data;
    }

    public void setDepartamento(String aValue) {
        departamento = aValue;
    }

    public String getDepartamento() {
        return departamento;
    }

    

    public void setResultado(String aValue) {
        resultado = aValue;
    }

    public String getResultado() {
        return resultado;
    }

    public void setTipo(String aValue) {
        tipo = aValue;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUpdated_by(String aValue) {
        updated_by = aValue;
    }

    public String getUpdated_by() {
        return updated_by;
    }
}
