package br.com.ajrdevops.TabelaFipe.service;


import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> tClasse);

    <T> List<T> obterLista(String json, Class<T> tClasse);

}

