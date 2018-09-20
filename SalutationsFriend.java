import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SalutationsFriend extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Salutations Friend");
        Button btn = new Button();
        btn.setText("Say 'Salutations Friend'");

        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Salutations Friend");
            }
        });

        StackPane root = new StackPane(); // makes a graph/backdrop
        root.getChildren().add(btn); // add button to the endpoints of the graph
        primaryStage.setScene(new Scene(root, 300, 250)); // setting the current scene on the stage (what will be displayed in the window) – is making a new scene to show
        primaryStage.show(); // shows window
    }
}
