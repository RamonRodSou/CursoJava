package br.com.rodsoutech.tabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Veiculo(
        @JsonAlias("TipoVeiculo") Integer tipoVeiculo,
        @JsonAlias("Valor")String valor,
        @JsonAlias("Marca")String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("AnoModelo")Integer AnoModelo,
        @JsonAlias("Combustivel")String combustivel,
        @JsonAlias("CodigoFipe")String CodigoFipe,
        @JsonAlias("MesReferencia") String mesReferencia,
        @JsonAlias("SiglaCombustivel")String SiglaCombustivel
) {
}
