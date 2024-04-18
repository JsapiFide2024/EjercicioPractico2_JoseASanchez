/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="empleados")

public class Empleado implements Serializable {
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="cargo")
    private String cargo;
    @Column(name="hotel_id")
    private int hotel;
    @Column(name="nombre")
    private String nombre;
    
   


//    @OneToMany
//    @JoinColumn(name = "id_categoria", updatable = false)
//    List<Producto> productos;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String cargo, int hotel) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.hotel = hotel;
    }
}