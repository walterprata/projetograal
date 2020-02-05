package br.com.projetograal.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "integrante")
public class Integrante {


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private BigDecimal id;
	
	private String nome;

}
