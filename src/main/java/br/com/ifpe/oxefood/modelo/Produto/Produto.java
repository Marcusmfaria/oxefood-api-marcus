package br.com.ifpe.oxefood.modelo.Produto;

import br.com.ifpe.oxefood.modelo.categoriaProduto.CategoriaProduto;
import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Produto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel {

    @ManyToOne
    private CategoriaProduto categoria;

    @Column
    private String codigo;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private Double valorUnitario;
    @Column
    private Integer tempoEntregaMinimo;
    @Column
    private Integer tempoEntregaMaximo;

}