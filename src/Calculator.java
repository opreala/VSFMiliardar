import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox parinte = new HBox();
        parinte.setSpacing(30);
        VBox child1 = new VBox ();
        child1.setSpacing(30);
        VBox child2 = new VBox ();
        child2.setSpacing(30);
        VBox child3 = new VBox ();
        child3.setSpacing(30);
        VBox child4 = new VBox ();
        child4.setSpacing(30);

        Label labelNr1 = new Label("Introdu primul numar");
        TextField textFieldNr1 = new TextField();
        Label labelNr2 = new Label("Introdu cel de-al doilea numar");
        TextField textFieldNr2 = new TextField();
        Button buttonAdunare = new Button("Adunare");
        Label labelRes = new Label();
        child1.getChildren().addAll(labelNr1, labelNr2, buttonAdunare, labelRes);

        Button buttonScadere = new Button("Scadere");
        child2.getChildren().addAll(textFieldNr1, textFieldNr2, buttonScadere);

        Button buttonInmultire = new Button("Inmultire");
        child3.getChildren().addAll(new Label(), new Label(), buttonInmultire);

        Button buttonImpartire = new Button("Impartire");
        child4.getChildren().addAll(new Label(), new Label(), buttonImpartire);


        parinte.getChildren().addAll(child1,child2,child3,child4);


        buttonAdunare.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int nr1 = Integer.parseInt(textFieldNr1.getText());
                int nr2 = Integer.parseInt(textFieldNr2.getText());
                labelRes.setText("Rezultatul este: " + (nr1 + nr2));
            }
        });

        buttonImpartire.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int nr1 = Integer.parseInt(textFieldNr1.getText());
                int nr2 = Integer.parseInt(textFieldNr2.getText());
                labelRes.setText("Rezultatul este: " + (nr1 / nr2));
            }
        });

        buttonInmultire.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int nr1 = Integer.parseInt(textFieldNr1.getText());
                int nr2 = Integer.parseInt(textFieldNr2.getText());
                labelRes.setText("Rezultatul este: " + (nr1 * nr2));
            }
        });

        buttonScadere.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int nr1 = Integer.parseInt(textFieldNr1.getText());
                int nr2 = Integer.parseInt(textFieldNr2.getText());
                labelRes.setText("Rezultatul este: " + (nr1 - nr2));
            }
        });

        Scene scene = new Scene(parinte);
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.show();



    }
}
