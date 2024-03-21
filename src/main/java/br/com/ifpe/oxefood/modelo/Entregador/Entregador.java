package br.com.ifpe.oxefood.modelo.Entregador;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Entregador")
@SQLRestriction("habilitado = true")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel {

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