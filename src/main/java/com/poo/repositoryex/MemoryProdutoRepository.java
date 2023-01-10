/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poo.repositoryex;

import java.util.ArrayList;

/**
 *
 * @author tulio
 */
public class MemoryProdutoRepository implements ProdutoRepository<Produto>{
    private ArrayList<Produto> produtos; //lista de produtos armazenados em memória
    
    MemoryProdutoRepository(ArrayList<Produto> p){
        produtos = new ArrayList(p);  //construtor recebendo um arraylist já populado
    }
    MemoryProdutoRepository(){
        produtos = new ArrayList(); //construtor padrão
    }
    
    @Override
    public void add(Produto p){
        produtos.add(p);
    }
    @Override
    public Produto get(int id) throws Exception{
        for (Produto produto : produtos) {
            if(produto.getId() == id){
                return produto;
            }
        }
        throw new Exception("Produto não encontrado");
    }
    @Override
    public ArrayList<Produto> get(){
        return produtos;
    }
    @Override
    public void remove(int id) throws Exception{
        for (Produto produto : produtos) {
            if(produto.getId() == id){
                produtos.remove(produtos.indexOf(produto));
                return;
            }
        }
        throw new Exception("Produto não encontrado");
    }
}
