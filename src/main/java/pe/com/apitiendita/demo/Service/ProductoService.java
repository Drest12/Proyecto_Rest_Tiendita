
package pe.com.apitiendita.demo.Service;

import java.util.List;
import java.util.Optional;
import pe.com.apitiendita.demo.Entity.ProductoEntity;


public interface ProductoService {
           //Funcion que permita mostrar todos los datos
    List<ProductoEntity> findAll();
    //Funcion que permita mostrar todos los datos habilitados
    List<ProductoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ProductoEntity> findById(Long id);
    //Funcion para registrar datos
    ProductoEntity add (ProductoEntity p); //d nombre de la variable distrito
    //Funcion para actualizar datos
    ProductoEntity update (ProductoEntity p); //d nombre de la variable distrito
    //Funcion para eliminar datos
    ProductoEntity delete (ProductoEntity p); //d nombre de la variable distrito
}
