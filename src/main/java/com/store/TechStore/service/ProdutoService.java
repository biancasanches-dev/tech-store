package com.store.TechStore.service;

import com.store.TechStore.model.Produto;
import com.store.TechStore.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void addProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProdutoById(long id) {
        return produtoRepository.findById(id);
    }

    public Produto updateProduto(long id, Produto produtoDetails) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produto.setNome(produtoDetails.getNome());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPreco(produtoDetails.getPreco());
        produto.setQuantidade(produtoDetails.getQuantidade());
        return produtoRepository.save(produto);
    }

    public void deleteProduto(long id) {
        produtoRepository.deleteById(id);
    }

}
