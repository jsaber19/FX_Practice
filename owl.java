import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// http://phi.lho.free.fr/images/screenshots/ShowNamedColors.png

public class owl extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.GAINSBORO);

        Rectangle branch = new Rectangle(50 ,400, 400, 7);
        branch.setFill(Color.TAN);
        root.getChildren().add(branch);

        Ellipse rightclaw1 = new Ellipse(205, 398, 4, 12);
        rightclaw1.setFill(Color.SIENNA);
        root.getChildren().add(rightclaw1);

        Ellipse rightclaw2 = new Ellipse(212, 398, 4, 12);
        rightclaw2.setFill(Color.FIREBRICK);
        root.getChildren().add(rightclaw2);

        Ellipse rightclaw3 = new Ellipse(219, 398, 4, 12);
        rightclaw3.setFill(Color.SIENNA);
        root.getChildren().add(rightclaw3);

        Ellipse leftclaw1 = new Ellipse(295, 398, 4, 12);
        leftclaw1.setFill(Color.SIENNA);
        root.getChildren().add(leftclaw1);

        Ellipse leftclaw2 = new Ellipse(288, 398, 4, 12);
        leftclaw2.setFill(Color.FIREBRICK);
        root.getChildren().add(leftclaw2);

        Ellipse leftclaw3 = new Ellipse(281, 398, 4, 12);
        leftclaw3.setFill(Color.SIENNA);
        root.getChildren().add(leftclaw3);

        Ellipse body = new Ellipse(250, 250, 140,150);
        body.setFill(Color.SADDLEBROWN);
        root.getChildren().add(body);

        Ellipse chest = new Ellipse(250, 250, 106,150);
        chest.setFill(Color.BURLYWOOD);
        root.getChildren().add(chest);

        Polygon headtop = new Polygon(
                130, 60,
                370, 60,
                250, 120);
        headtop.setFill(Color.SADDLEBROWN);
        root.getChildren().add(headtop);

        Polygon nose = new Polygon(
                230, 150,
                270, 150,
                250, 185);
        nose.setFill(Color.TOMATO);
        root.getChildren().add(nose);

        Circle righteyeshape = new Circle(200, 120, 60, Color.SADDLEBROWN);
        root.getChildren().add(righteyeshape);

        Circle lefteyeshape = new Circle(300, 120, 60, Color.SADDLEBROWN);
        root.getChildren().add(lefteyeshape);

        Circle righteyeinnershape = new Circle(200, 120, 45, Color.BISQUE);
        root.getChildren().add(righteyeinnershape);

        Circle lefteyeinnershape = new Circle(300, 120, 45, Color.BISQUE);
        root.getChildren().add(lefteyeinnershape);

        Circle righteyeiris = new Circle(200, 120, 30, Color.CORNFLOWERBLUE);
        root.getChildren().add(righteyeiris);

        Circle lefteyeiris = new Circle(300, 120, 30, Color.CORNFLOWERBLUE);
        root.getChildren().add(lefteyeiris);

        Circle rightpupil = new Circle(200, 120, 20, Color.BLACK);
        root.getChildren().add(rightpupil);

        Circle leftpupil = new Circle(300, 120, 20, Color.BLACK);
        root.getChildren().add(leftpupil);

        Circle rightshine = new Circle(202, 114, 5, Color.SNOW);
        root.getChildren().add(rightshine);

        Circle leftshine = new Circle(298, 114, 5, Color.SNOW);
        root.getChildren().add(leftshine);

        scene.setOnMouseMoved(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                scene.setFill(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
           }
        });

        stage.setTitle("owl be your masterpiece ;)))");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
