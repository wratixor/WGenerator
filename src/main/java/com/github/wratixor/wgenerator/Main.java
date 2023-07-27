package com.github.wratixor.wgenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.InputStream;


public class Main extends Application {
    public static final Logger LOGGER = LogManager.getLogger("main");

    public static void main(String[] args) {
        LOGGER.debug("DEBUG");
        LOGGER.info("INFO");
        LOGGER.warn("WARN");
        LOGGER.error("ERROR");
        LOGGER.fatal("FATAL");
        LOGGER.trace("TRACE");
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dogs application");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);

        InputStream iconStream = getClass().getResourceAsStream("/icon.png");
        assert iconStream != null;
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        Button button = new Button("WOF WOF ???'");

        button.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "WOF WOF WOF!!!");
            alert.showAndWait();
        });
        Scene primaryScene = new Scene(button);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

}