/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.poo.repositoryex;

import java.util.Date;

/**
 *
 * @author tulio
 */
public class main {

    public static void main(String[] args) {
        ProdutoRepository produtos = new MemoryProdutoRepository();
        Produto p  = new Produto(0,"mouse", 16.99, "Mouse multi 800 dpi", new Date(System.currentTimeMillis()));
        produtos.add(p);
        p  = new Produto(1,"teclado", 44.99, "Teclado corsair meânico switch blue", new Date(System.currentTimeMillis()));
        produtos.add(p);
        p  = new Produto(2,"cpu", 2349.99, "AMD ryzen 7950x3d 5.7Ghz", new Date(System.currentTimeMillis()));
        produtos.add(p);
        System.out.println(produtos.get());
        try{produtos.remove(2);
        produtos.remove(1);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println(produtos.get());
        
    }
}
