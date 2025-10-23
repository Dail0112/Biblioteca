package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "cattegorias")
@Getter
@Setter
@NamedQueries({
        @NamedQueries(name = "categorias.ALL",
                query = "select  c from categorias  c")
})

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_categoria", length = 60, nullable = false)
    private String nombre;


}
