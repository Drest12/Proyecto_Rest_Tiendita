
package pe.com.apitiendita.demo.Service;

import java.util.List;
import java.util.Optional;
import pe.com.apitiendita.demo.Entity.CategoriaEntity;


public interface CategoriaService {
        //Funcion que permita mostrar todos los datos
    List<CategoriaEntity> findAll();
    //Funcion que permita mostrar todos los datos habilitados
    List<CategoriaEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<CategoriaEntity> findById(Long id);
    //Funcion para registrar datos
    CategoriaEntity add (CategoriaEntity c); //d nombre de la variable distrito
    //Funcion para actualizar datos
    CategoriaEntity update (CategoriaEntity c); //d nombre de la variable distrito
    //Funcion para eliminar datos
    CategoriaEntity delete (CategoriaEntity c); //d nombre de la variable distrito
}
