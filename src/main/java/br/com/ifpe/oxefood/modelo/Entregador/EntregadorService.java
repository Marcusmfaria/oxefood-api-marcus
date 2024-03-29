package br.com.ifpe.oxefood.modelo.Entregador;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.Produto.Produto;
import br.com.ifpe.oxefood.modelo.cliente.Cliente;

import java.time.LocalDate;
import java.util.List;

@Service
public class EntregadorService {

    @Autowired
    private EntregadorRepository repository;

    @Transactional
    public Entregador save(Entregador entregador) {

        entregador.setHabilitado(Boolean.TRUE);
        entregador.setVersao(1L);
        entregador.setDataCriacao(LocalDate.now());
        return repository.save(entregador);
    }

    public List<Entregador> listarTodos() {

        return repository.findAll();
    }

    public Entregador obterPorID(Long id) {

        return repository.findById(id).get();
    }

}
