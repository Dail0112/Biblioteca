package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NamedQueries({
        @NamedQueries(name = "autores.ALL", query = "select  l from Libro  l")

})
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60, nullable = false)
    private String titulo;
    private int añoPub;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria.id")
    private Categoria categoria;

}
