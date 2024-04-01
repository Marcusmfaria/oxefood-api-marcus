package br.com.ifpe.oxefood.api.entregador;

import br.com.ifpe.oxefood.modelo.Entregador.Entregador;
import br.com.ifpe.oxefood.modelo.Entregador.EntregadorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/entregador")
@CrossOrigin
public class EntregadorController {

    @Autowired
    private EntregadorService entregadoService;

    @PostMapping
    public ResponseEntity<Entregador> save (@RequestBody EntregadorRequest request) {

        Entregador entregador = entregadoService.save(request.build());
        return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Entregador> listarTodos(){
        return entregadoService.listarTodos();
    }

    @GetMapping
    public Entregador obterPorId(@PathVariable Long id){
        return entregadoService.obterPorId(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Entregador> update(@PathVariable("id") Long id, @RequestBody EntregadorRequest entregadorRequest){
        entregadoService.update(id, entregadorRequest.build());
        return ResponseEntity.ok().build();
    }
    

}