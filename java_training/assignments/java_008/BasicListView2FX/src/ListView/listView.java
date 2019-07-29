package ListView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class listView extends Application {
 
public void start(Stage primaryStage) {
 GridPane aPane = new GridPane();
 aPane.setPadding(new Insets(10, 10, 10, 10));
 TextField newItemField = new TextField();
 newItemField.setMinHeight(30);
 aPane.add(newItemField,0,0);
 GridPane.setMargin(newItemField, new Insets(0, 0, 10, 0));

 Button addButton = new Button("Add");
 aPane.add(addButton,1,0);
 addButton.setMinHeight(30);
 addButton.setMinWidth(100);
 GridPane.setMargin(addButton, new Insets(0, 0, 10, 10));
 
 ListView<String> transportList = new ListView<String>();
 String[] TransportType = {"Train", "Car", "Airplane"};
 transportList.setItems(FXCollections.observableArrayList(TransportType));
 transportList.setPrefWidth(Integer.MAX_VALUE);
 transportList.setPrefHeight(Integer.MAX_VALUE);
 aPane.add(transportList,0,1);

 Button removeButton = new Button("Remove");
 aPane.add(removeButton,1,1);
 removeButton.setMinHeight(30);
 removeButton.setMinWidth(100);
 
 GridPane.setMargin(removeButton, new Insets(0, 0, 0, 10));
 GridPane.setValignment(removeButton, VPos.TOP);
 primaryStage.setTitle("basicjavafxlistview2");
 primaryStage.setScene(new Scene(aPane, 420,320));
 primaryStage.show();
 }
 public static void main(String[] args) { launch(args); }
}
