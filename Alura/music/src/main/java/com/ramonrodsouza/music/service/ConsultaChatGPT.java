package com.ramonrodsouza.music.service;

import com.theokanning.openai.OpenAiHttpException;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterInformacao(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("me fale sobre o artista: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        try {
        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
        } catch (OpenAiHttpException e) {
            System.out.println("Erro de cota: " + e.getMessage());
            return texto;
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            return "Erro ao obter tradução.";
        }
    }
}
