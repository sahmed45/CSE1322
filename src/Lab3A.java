


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.geometry.Insets;


public class Lab3A extends Application implements EventHandler<ActionEvent> {

	Button button;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;      
   Text text;
   
   
	public static void main(String[] args){
		launch(args);
}
@Override
public void start(Stage primaryStage) {
	primaryStage.setTitle("My Button");
	button= new Button();
	button.setText("button1");
	button.setOnAction(this);
	button2 = new Button();
	button2.setText("button2");
	button2.setOnAction(this);
	button3 = new Button();
	button3.setText("button3");
	button3.setOnAction(this);
	button4 = new Button();
	button4.setText("button4");
	button4.setOnAction(this);
	button5 = new Button();
	button5.setText("button5");
	button5.setOnAction(this);
	button6 = new Button();
	button6.setText("button6");
	button6.setOnAction(this);
   text = new Text();
   
   text.setText(String.valueOf(""));
   BorderPane pane= new BorderPane();
   pane.setTop(text);
HBox layout = new HBox();

   layout.setPadding(new Insets(10,10,10,10));      
   layout.setSpacing(10);      
   layout.getChildren().addAll(button, button2,button3,button4,button5,button6);   
   pane.setTop(layout);
   pane.setBottom(text);
   pane.setPadding(new Insets(20,50,50,50));
   Scene scene= new Scene (pane,600,300);
         primaryStage.setScene(scene);
   primaryStage.show();

	
	
}


@Override
public void handle(ActionEvent event) {
	if(event.getSource()==button) {
		System.out.println("clicked 1");
		
	}
	if(event.getSource()==button2) {
		System.out.println("clicked 2");
	}
   	if(event.getSource()==button3) {
		System.out.println("clicked 3");
	}
   	if(event.getSource()==button4) {
		System.out.println("clicked 4");
	}
   	if(event.getSource()==button5) {
		System.out.println("clicked 5");
	}
   	if(event.getSource()==button6) {
		System.out.println("clicked 6");
	}
   }
}

