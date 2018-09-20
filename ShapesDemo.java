import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapesDemo extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.GAINSBORO);

        Circle c = new Circle(120, 400, 70);
        c.setFill(Color.ROSYBROWN);
        root.getChildren().add(c);

        Circle c2 = new Circle(385, 400, 70);
        c2.setFill(Color.ROSYBROWN);
        root.getChildren().add(c2);

        Rectangle r = new Rectangle(120,25,250,250);
        r.setFill(Color.LAWNGREEN);
        root.getChildren().add(r); // add rect as leaf in graph

        Region re = new Region();


        stage.setTitle("JavaFX Scene Graph Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
