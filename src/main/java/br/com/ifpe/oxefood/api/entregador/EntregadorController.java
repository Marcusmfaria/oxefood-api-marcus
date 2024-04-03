package br.com.ifpe.oxefood.api.entregador;

import br.com.ifpe.oxefood.modelo.Entregador.Entregador;
import br.com.ifpe.oxefood.modelo.Entregador.EntregadorService;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/entregador")
@CrossOrigin
public class EntregadorController {

    @Autowired
    private EntregadorService entregadorService;

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @PostMapping
    public ResponseEntity<Entregador> save (@RequestBody EntregadorRequest request) {

        Entregador entregador = entregadorService.save(request.build());
        return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
   @GetMapping
    public List<Entregador> listarTodos() {
        return entregadorService.listarTodos();
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @GetMapping("/{id}")
    public Entregador obterPorID(@PathVariable Long id) {
        return entregadorService.obterPorID(id);
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @PutMapping("{id}")
    public ResponseEntity<Entregador> update(@PathVariable("id") Long id, @RequestBody EntregadorRequest entregadorRequest){
        entregadorService.update(id, entregadorRequest.build());
        return ResponseEntity.ok().build();
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        entregadorService.delete(id);
        return ResponseEntity.ok().build();
    }
    

}