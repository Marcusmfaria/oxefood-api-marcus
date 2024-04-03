package br.com.ifpe.oxefood.api.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.ifpe.oxefood.modelo.Produto.Produto;
import br.com.ifpe.oxefood.modelo.Produto.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @PostMapping
    public ResponseEntity<Produto> save (@RequestBody ProdutoRequest request) {

        Produto produto = produtoService.save(request.build());
        return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
    }
    
    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
   @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @GetMapping("/{id}")
    public Produto obterPorID(@PathVariable Long id) {
        return produtoService.obterPorId(id);
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") Long id, @RequestBody ProdutoRequest produtoRequest){
        produtoService.update(id, produtoRequest.build());
        return ResponseEntity.ok().build();
    }

    @Operation(
            summary = "Serviço responsável por salvar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por inserir um cliente no sistema."
        )     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        produtoService.delete(id);
        return ResponseEntity.ok().build();
    }
}