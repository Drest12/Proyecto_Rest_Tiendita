/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apitiendita.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apitiendita.demo.Entity.ProductoEntity;


/**
 *
 * @author User
 */
public interface ProductoRepository extends JpaRepository<ProductoEntity,Long>{
    @Query("select p from CategoriaEntity p where p.estado=1")
    List<ProductoEntity> findAllCustom();
}
