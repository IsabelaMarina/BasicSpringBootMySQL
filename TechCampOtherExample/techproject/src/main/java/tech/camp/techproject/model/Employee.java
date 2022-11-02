package tech.camp.techproject.model;

import javax.persistence.*;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;

@Entity
@Table(name="persona3")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //IDENTITY
    private int id;
    private String nombre;
    private double telefono;



    public Employee(int id, String nombre, double telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getTelefono(){
        return telefono;
    }


}
