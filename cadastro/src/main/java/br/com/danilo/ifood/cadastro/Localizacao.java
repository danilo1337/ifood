package br.com.danilo.ifood.cadastro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "localizacao")
public class Localizacao extends PanacheEntityBase {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    public Double latitude;
    
    public Double longitude;
	
}
