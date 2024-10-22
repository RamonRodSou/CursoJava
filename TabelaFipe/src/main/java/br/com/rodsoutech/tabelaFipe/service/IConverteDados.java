package br.com.rodsoutech.tabelaFipe.service;


import java.util.List;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);

    <T>List<T> obterListd (String json ,Class<T> classe);

}
