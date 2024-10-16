package br.com.IFPB.screenMatch.services;

public interface IConvertDados {

   <T> T ObterDados(String json, Class<T> classe);

    
}
