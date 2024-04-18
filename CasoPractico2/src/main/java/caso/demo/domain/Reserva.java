
package caso.demo.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name="reservas")

public class Reserva implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="cliente_nombre")
    private String nombre;
    @Column(name="num_huespedes")
    private String huespedes;
    @Column(name="fecha_ingreso")
    private String inicio;
    @Column(name="fecha_salida")
    private String fin;
    @Column(name="hotel_id")
    private String hotel;
    @Column(name="numero_cedula")
    private String cedula;

    public Reserva() {
    }

    public Reserva(Long id, String nombre, String huespedes, String inicio, String fin, String hotel, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.huespedes = huespedes;
        this.inicio = inicio;
        this.fin = fin;
        this.hotel = hotel;
        this.cedula = cedula;
    }

    

    
}
