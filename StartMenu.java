import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Set;

public class StartMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Text title = new Text("HABITAT EXPLORER");
        title.setFont(Font.font("Verdana", 50));
        
        // Create the "Start" button
        Button startButton = new Button("Start Habitat Explorer");
        startButton.setOnAction(e -> {
            // When clicked, open the next screen (Habitat Explorer)
            HabitatExplorer habitatExplorer = new HabitatExplorer();
            try {
                habitatExplorer.start(primaryStage);  // Load Habitat Explorer within the same stage
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // Layout for the start menu
        StackPane layout = new StackPane();
        layout.getChildren().add(startButton);

        Image backgroundImage = new Image("C:\\Users\\admin\\OneDrive\\Desktop\\TECHNOVATION '24\\earth.png");
        ImageView backgroundView = new ImageView(backgroundImage);
        backgroundView.setFitWidth(800);  
        backgroundView.setFitHeight(600); 
        backgroundView.setPreserveRatio(true);
        
        VBox buttonBox = new VBox(15);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(startButton);

        
        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView, title, buttonBox);
        StackPane.setAlignment(title, Pos.TOP_CENTER);  
        StackPane.setAlignment(buttonBox, Pos.CENTER);  
        
        // Create and set the scene
        Scene startScene = new Scene(root, 800, 600);
        primaryStage.setTitle("Start Menu");
        primaryStage.setScene(startScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the application (StartMenu)
    }
}
