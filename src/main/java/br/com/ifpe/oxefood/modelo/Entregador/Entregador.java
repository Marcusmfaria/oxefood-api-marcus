package br.com.ifpe.oxefood.modelo.Entregador;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Entregador")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel {


    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String rg;
    @Column
    private LocalDate dataNascimento;
    @Column
    private LocalDate foneFixo;
    @Column
    private LocalDate foneCelular;
    @Column
    private LocalDate qtdEntregasRealizadas;
    @Column
    private Double valorFrete;
    @Column
    private String enderecoRua;
    @Column
    private String enderecoNumero;
    @Column
    private String enderecoBairro;
    @Column
    private String enderecoCidade;
    @Column
    private String enderecoCep;
    @Column
    private String enderecoUf;
    @Column
    private String enderecoComplemento;
    @Column
    private Boolean ativo;


}