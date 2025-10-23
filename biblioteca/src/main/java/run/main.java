package run;

import config.JPAConexion;
import java.util.List;
import entities.Categoria;
import entities.Libro;
import entities.Autor;
import services.interfaces.ICRUD;

public class main {
    public static  final ICRUD dao = new MyDao();
    public static void insertarAutor(){
        Autor a = new Autor();
        a.setNombre("Gabriel García Marquez");
        a.setNacionalidad("Mexicana");
        dao.insert(a);

        Autor r = new Autor();
        r.setNombre("Ruben Dario");
        r.setNacionalidad("Nicaragüense");
        dao.insert(r);
    }
    public static void listarAutores(){
        System.out.println("Registro Almacenados: ");
        List<Autor> autores = dao.getAll("autores.All", Autor.All,Autor.class);
        autores.forEach(autor -> System.out.println(autor.getNombre()));
    }
    public static void editarAutor(){
        Autor a = new Autor();
        a = dao.findById(1, Autor.class);
        a.setNombre("Colombiana");
        dao.update(a);
    }
}
