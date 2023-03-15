
package pe.com.apitiendita.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apitiendita.demo.Entity.ProductoEntity;
import pe.com.apitiendita.demo.Repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository; 
    
    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productoRepository.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
       return productoRepository.findById(id); 
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return productoRepository.save(p);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objdistrito=productoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objdistrito);
        return productoRepository.save(objdistrito); 
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
       ProductoEntity objdistrito=productoRepository.getById(p.getCodigo());
       objdistrito.setEstado(false);
       return productoRepository.save(objdistrito);
    }
    
}
