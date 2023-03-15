package pe.com.apitiendita.demo.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apitiendita.demo.Entity.ProductoEntity;
import pe.com.apitiendita.demo.Service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
     @Autowired
    private ProductoService productoservice;
    //GetMapping sirve para obtener valores

    @GetMapping
    public List<ProductoEntity> findAll() {
        return productoservice.findAll();
    }
    @GetMapping("/custom")
    public List<ProductoEntity>findAllCustom()
    {
        return productoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional <ProductoEntity> findById(@PathVariable Long id )
    {
     return productoservice.findById(id); 
    }
    @PostMapping
    public ProductoEntity add (@RequestBody ProductoEntity pro)
    {
        return productoservice.add(pro);
    }
    @PutMapping("/{id}")
    public ProductoEntity update (@PathVariable long id,@RequestBody ProductoEntity pro)
    {
        pro.setCodigo(id);
        return productoservice.update(pro);
    }
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id)      
    {
        ProductoEntity objdis=new ProductoEntity();
        objdis.setEstado(false);
        return productoservice.delete(ProductoEntity.builder().codigo(id).build());
    }
    
}
