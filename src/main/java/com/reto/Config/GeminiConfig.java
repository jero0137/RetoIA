package com.reto.Config;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.generativeai.ChatSession;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeminiConfig
{
    @Bean
    public VertexAI vertexai(){
        return new VertexAI("retobanco", "us-east4");
    }
    @Bean
    public GenerativeModel generativeModel(VertexAI vertexAI){
        return new GenerativeModel("gemini-pro", vertexAI);
    }

    @Bean
    public ChatSession chatSession(@Qualifier("generativeModel") GenerativeModel generativeModel) {
        return new ChatSession(generativeModel);
    }
}
