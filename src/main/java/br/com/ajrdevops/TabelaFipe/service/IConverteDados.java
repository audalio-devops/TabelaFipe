package br.com.ajrdevops.TabelaFipe.service;


public interface IConverteDados {
    <T> T obterDados(String json, Class<T> tClasse);
}

