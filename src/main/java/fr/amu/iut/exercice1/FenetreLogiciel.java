package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Création du conteneur principal
        VBox vbox = new VBox();
        HBox.setHgrow(vbox, Priority.ALWAYS);

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        HBox topControls = new HBox();

        // Création barre menu
        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");
        MenuItem new1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem close = new MenuItem("Close");
        file.getItems().addAll(new1, open, save, close);

        Menu edit = new Menu("Edit");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        edit.getItems().addAll(cut, copy, paste);

        Menu help = new Menu("Help");

        menuBar.getMenus().addAll(file, edit, help);
        topControls.getChildren().addAll(menuBar);

        // Création bloc principal
        HBox main = new HBox();
        VBox.setVgrow(main, Priority.ALWAYS);
        HBox.setHgrow(main, Priority.ALWAYS);

        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du conteneur de droite contenant les boutons
        VBox leftControls = new VBox();
        VBox.setVgrow( leftControls, Priority.ALWAYS );
        leftControls.setAlignment(Pos.CENTER);

        // Création des boutons
        Label boutons = new Label("Boutons :");
        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 1");
        Button b3 = new Button("Bouton 1");
        leftControls.getChildren().addAll(boutons, b1, b2, b3);

        // Création de la ligne de séparation verticale
        Separator sepv = new Separator(Orientation.VERTICAL);

        // Création du conteneur de formulaire à droite
        VBox rightControls = new VBox();
        VBox.setVgrow( rightControls, Priority.ALWAYS );
        HBox.setHgrow(rightControls, Priority.ALWAYS);
        rightControls.setAlignment(Pos.CENTER);

        // Création formulaire
        GridPane gridPane = new GridPane();

        gridPane.add(new Label("Name:"), 1, 0);
        gridPane.add(new TextField(), 2, 0);
        gridPane.add(new Label("Email:"), 1, 1);
        gridPane.add(new TextField(), 2, 1);
        gridPane.add(new Label("Password:"), 1, 2);
        gridPane.add(new TextField(), 2, 2);

        HBox buttons = new HBox();
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");
        buttons.getChildren().addAll(submit, cancel);

        rightControls.getChildren().addAll(gridPane, buttons);

        main.getChildren().addAll(leftControls, sepv, rightControls);

        // Création de la ligne de séparation verticale
        Separator sepv2 = new Separator();

        HBox bottomControls = new HBox();
        HBox.setHgrow(bottomControls, Priority.ALWAYS);
        bottomControls.setAlignment(Pos.CENTER);
        Label blabel = new Label("Ceci est un label de bas de page");
        bottomControls.getChildren().add(blabel);

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                topControls,
                sep,
                main,
                sepv2,
                bottomControls
        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

