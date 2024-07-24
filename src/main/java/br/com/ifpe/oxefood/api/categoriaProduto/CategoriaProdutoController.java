package br.com.ifpe.oxefood.api.categoriaProduto;

import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.api.cliente.ClienteRequest;
import br.com.ifpe.oxefood.modelo.categoriaProduto.CategoriaProduto;
import br.com.ifpe.oxefood.modelo.categoriaProduto.CategoriaProdutoService;
import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/categoriaProduto")
@CrossOrigin
public class CategoriaProdutoController {
    @Autowired
    private CategoriaProdutoService categoriaProdutoService;


    @Operation(
    summary = "Serviço responsável por salvar uma categoria de produto no sistema.",
       description = "Exemplo de descrição de um endpoint responsável por inserir uma categoria de produto no sistema."
    )
     @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestBody CategoriaProdutoRequest request) {

        CategoriaProduto categoriaProduto = categoriaProdutoService.save(request.build());
        return new ResponseEntity<CategoriaProduto>(categoriaProduto, HttpStatus.CREATED);
    }
    
    @Operation(
       summary = "Serviço responsável por listar todas as categorias de produto no sistema.",
       description = "Exemplo de descrição de um endpoint responsável por listar todas as categorias de produto no sistema."
   )
    @GetMapping
    public List<CategoriaProduto> listarTodos() {
        return categoriaProdutoService.listarTodos();
    }

    @Operation(
       summary = "Serviço responsável por listar uma categoria de produto no sistema.",
       description = "Exemplo de descrição de um endpoint responsável por listar uma categoria de produto no sistema."
   )
    @GetMapping("/{id}")
    public CategoriaProduto obterPorID(@PathVariable Long id) {
        return categoriaProdutoService.obterPorID(id);
    }

     @Operation(
       summary = "Serviço responsável por alterar uma categoria de produto no sistema.",
       description = "Exemplo de descrição de um endpoint responsável por alterar uma categoria de produto no sistema."
   )
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaProduto> update(@PathVariable("id") Long id, @RequestBody CategoriaProdutoRequest request) {
        categoriaProdutoService.update(id, request.build());
        return ResponseEntity.ok().build();}
    
          @Operation(
            summary = "Serviço responsável por deletar um cliente no sistema.",
            description = "Exemplo de descrição de um endpoint responsável por deletar um cliente no sistema."
        )     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        categoriaProdutoService.delete(id);
        return ResponseEntity.ok().build();
    }



}
