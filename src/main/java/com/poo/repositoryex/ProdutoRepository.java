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
public interface ProdutoRepository<T> {
    public void add(T p);
    public T get(int id) throws Exception;
    public ArrayList<T> get();
    public void remove(int id) throws Exception;
}
