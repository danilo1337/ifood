package br.com.danilo.ifood.cadastro;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "restaurante")
public class Restaurante extends PanacheEntityBase {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    public String propietario;
    
    public String cnpj;
    
    public String nome;
    
    @ManyToOne
    public Localizacao localizacao;
    
    @CreationTimestamp
    @Schema(hidden = true)
    public Date dataCriacao;
    
    @UpdateTimestamp
    public Date dataAtualizacao;
	
}
