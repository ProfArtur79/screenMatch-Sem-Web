package br.com.IFPB.screenMatch.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados implements IConvertDados {
    
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T ObterDados(String json, Class<T> classe) {
       try {
        return mapper.readValue(json, classe);

       } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
       }
        
    }

}
