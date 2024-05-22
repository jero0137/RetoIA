package com.reto.Controllers;

import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ChatSession;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import com.reto.Models.Document;
import com.reto.Models.PdfReader;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatSession chatSession1;
    private final ChatSession chatSession2;
    private final ChatSession chatSession3;

    private final PdfReader pdfReader = new PdfReader();

    @GetMapping("/cuento/{text}")
    public String chat1(@PathVariable String text) throws IOException {
        String documentContent = pdfReader.readPdfContent("C:\\Users\\Jeronimo\\IdeaProjects\\reto\\src\\main\\java\\com\\reto\\Documents\\Cuentos-que-cuidan .pdf");
        String fullMessage = documentContent + " " + text;
        GenerateContentResponse generateContentResponse = this.chatSession1.sendMessage(fullMessage);
        return ResponseHandler.getText(generateContentResponse);
    }

    @GetMapping("/vanguardia/{text}")
    public String chat2(@PathVariable String text) throws IOException {
        String documentContent = pdfReader.readPdfContent("C:\\Users\\Jeronimo\\IdeaProjects\\reto\\src\\main\\java\\com\\reto\\Documents\\vanguardias.pdf");
        String fullMessage = documentContent + " " + text;
        GenerateContentResponse generateContentResponse = this.chatSession2.sendMessage(fullMessage);
        return ResponseHandler.getText(generateContentResponse);
    }

    @GetMapping("/mito/{text}")
    public String chat3(@PathVariable String text) throws IOException {
        String documentContent = pdfReader.readPdfContent("C:\\Users\\Jeronimo\\IdeaProjects\\reto\\src\\main\\java\\com\\reto\\Documents\\mito_de_las_estrellas.pdf");
        String fullMessage = documentContent + " " + text;
        GenerateContentResponse generateContentResponse = this.chatSession3.sendMessage(fullMessage);
        return ResponseHandler.getText(generateContentResponse);
    }

    

}
