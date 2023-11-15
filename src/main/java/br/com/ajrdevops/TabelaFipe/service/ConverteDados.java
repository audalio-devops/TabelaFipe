package br.com.ajrdevops.TabelaFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> tClasse) {
        try {
            return mapper.readValue(json, tClasse);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

