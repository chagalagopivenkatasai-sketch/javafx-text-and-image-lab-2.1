import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Create Label
        Label textLabel = new Label("Hello, JavaFX!");
        
        // 2. Create Image and ImageView
        // Use your image path here, or use a web URL for testing
        // For local: "file:///C:/path/to/your/image.png"
        Image image = new Image("https://via.placeholder.com/200");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        // 3. Organize vertically using VBox
        VBox vbox = new VBox(20); // 20 spacing
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(textLabel, imageView);

        // 4. Set Scene size 400x400
        Scene scene = new Scene(vbox, 400, 400);

        primaryStage.setTitle("Text and Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
