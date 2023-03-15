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
import pe.com.apitiendita.demo.Entity.CategoriaEntity;
import pe.com.apitiendita.demo.Service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaservice;
    //GetMapping sirve para obtener valores

    @GetMapping
    public List<CategoriaEntity> findAll() {
        System.out.println("xd");
        return categoriaservice.findAll();
        
    }
    @GetMapping("/custom")
    public List<CategoriaEntity>findAllCustom()
    {
        return categoriaservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional <CategoriaEntity> findById(@PathVariable Long id )
    {
     return categoriaservice.findById(id); 
    }
    @PostMapping
    public CategoriaEntity add (@RequestBody CategoriaEntity cat)
    {
        return categoriaservice.add(cat);
    }
    @PutMapping("/{id}")
    public CategoriaEntity update (@PathVariable long id,@RequestBody CategoriaEntity cat)
    {
        cat.setCodigo(id);
        return categoriaservice.update(cat);
    }
    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id)      
    {
        CategoriaEntity objdis=new CategoriaEntity();
        
        objdis.setEstado(false);
        return categoriaservice.delete(CategoriaEntity.builder().codigo(id).build());
    }
    
}
