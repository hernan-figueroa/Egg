/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import javax.persistence.*;

/**
 *
 * @author Hernan
 */
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long ducumento;
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente() {
    }

    public Cliente(Integer id, Long ducumento, String nombre, String apellido, String telefono) {
        this.id = id;
        this.ducumento = ducumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public Cliente(Long ducumento, String nombre, String apellido, String telefono) {
        this.ducumento = ducumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDucumento() {
        return ducumento;
    }

    public void setDucumento(Long ducumento) {
        this.ducumento = ducumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", ducumento=" + ducumento + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
    
}
