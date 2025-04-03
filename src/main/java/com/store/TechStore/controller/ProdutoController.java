package com.store.TechStore.controller;

import com.store.TechStore.model.Produto;
import com.store.TechStore.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Página principal
    @GetMapping
    public String showStorePage(Model model) {
        model.addAttribute("produto", new Produto()); // Para o formulário de cadastro
        model.addAttribute("produtos", produtoService.getAllProdutos());
        return "store";
    }

    // Cadastrar produto
    @PostMapping("/cadastrar")
    public String addProduto(@ModelAttribute Produto produto, RedirectAttributes attributes) {
        produtoService.addProduto(produto);
        attributes.addFlashAttribute("success", "Produto cadastrado com sucesso!");
        return "redirect:/";
    }

    // Editar produto
    @PostMapping("/editar/{id}")
    public String updateProduto(@PathVariable int id, @ModelAttribute Produto produto, RedirectAttributes attributes) {
        produtoService.updateProduto(id, produto);
        attributes.addFlashAttribute("success", "Produto atualizado com sucesso!");
        return "redirect:/";
    }

    // Excluir produto
    @GetMapping("/excluir/{id}")
    public String deleteProduto(@PathVariable int id, RedirectAttributes attributes) {
        produtoService.deleteProduto(id);
        attributes.addFlashAttribute("success", "Produto excluído com sucesso!");
        return "redirect:/";
    }
}
