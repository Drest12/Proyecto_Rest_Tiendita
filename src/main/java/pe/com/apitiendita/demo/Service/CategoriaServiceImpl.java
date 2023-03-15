/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apitiendita.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apitiendita.demo.Entity.CategoriaEntity;
import pe.com.apitiendita.demo.Repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

     @Autowired
    private CategoriaRepository categoriaRepository; 
    
    @Override
    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id); 
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
         return categoriaRepository.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
         CategoriaEntity objdistrito=categoriaRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objdistrito);
        return categoriaRepository.save(objdistrito); 
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objdistrito=categoriaRepository.getById(c.getCodigo());
       objdistrito.setEstado(false);
       return categoriaRepository.save(objdistrito);
    }
    
}
