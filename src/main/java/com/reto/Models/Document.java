package com.reto.Models;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Document {

    private String path;
    private String content;

    public Document(String filePath) throws IOException {
        try (PDDocument document = PDDocument.load(Files.newInputStream(Paths.get(filePath)))) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            content =  pdfStripper.getText(document);
        }
    }

    public String getContent() {
        return content;
    }
}
