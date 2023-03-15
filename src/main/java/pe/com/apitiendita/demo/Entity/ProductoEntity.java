/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apitiendita.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ProductoEntity")
@Table(name="t_producto")

public class ProductoEntity {
    
        private static final long serialVersionUID=1L;
        @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="codpro")
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="preproc")
    private double preciocompra;
    @Column(name="preprov")
    private double precioventa;
    @Column(name="canpro")
    private boolean cantidad;
    @Column(name="estpro")
    private boolean estado;
     @ManyToOne
    @JoinColumn(name="codcat", nullable=false)
    private CategoriaEntity categoria;


    
    
}
