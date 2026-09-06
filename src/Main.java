import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Create the UI components
        Label messageLabel = new Label("Click the button below!");
        Button actionButton = new Button("Click Me");

        // 2. Add an action listener to the button
        actionButton.setOnAction(event -> {
            messageLabel.setText("Hello, JavaFX World!");
        });

        // 3. Arrange components in a layout container (vertical box)
        VBox root = new VBox(15); // 15px spacing between elements
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(messageLabel, actionButton);

        // 4. Create the scene with the layout, width, and height
        Scene scene = new Scene(root, 300, 200);

        // 5. Configure and display the main window (Stage)
        primaryStage.setTitle("JavaFX Terminal Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launches the JavaFX application
        launch(args);
    }
}
