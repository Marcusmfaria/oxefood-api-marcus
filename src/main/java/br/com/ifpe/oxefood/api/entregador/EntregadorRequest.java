package br.com.ifpe.oxefood.api.entregador;

import br.com.ifpe.oxefood.modelo.Entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

    private Double valorFrete;
    private String enderecoRua;
    private String enderecoNumero;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoCep;
    private String enderecoUf;
    private String enderecoComplemento;
    private Boolean ativo;

    public Entregador build() {

       return Entregador.builder()
                .ativo(ativo)
                .enderecoNumero(enderecoNumero)
                .enderecoCidade(enderecoCidade)
                .enderecoBairro(enderecoBairro)
                .enderecoCep(enderecoCep)
                .enderecoRua(enderecoRua)
                .enderecoComplemento(enderecoComplemento)
                .enderecoUf(enderecoUf)
                .valorFrete(valorFrete)
                .build();
    }
}