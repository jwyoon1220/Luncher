package com.github.jwyoon.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.File;
import java.io.IOException;

public class CustomLauncherController {

    @FXML
    private Button runButton;

    @FXML
    public void initialize() {
        runButton.setOnAction(event -> runMinecraft());
    }

    private void runMinecraft() {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-jar", "minecraft.jar");
            pb.directory(new File("C:/path/to/minecraft/directory"));
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}