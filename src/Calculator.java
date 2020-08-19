import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application implements EventHandler<ActionEvent> {

	
	Button sum = new Button("=");
	Label lblsum= new Label("Sum:");
	Label dsply= new Label();
	Label num1 = new Label("Number 1");
	Label num2= new Label("Number 2");
	TextField n1= new TextField();
	TextField n2= new TextField();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		Scene scene = new Scene (pane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Calculator");
		pane.add(num1,0,0);
		pane.add(n1, 1, 0);
		pane.add(num2,0,1);
		pane.add(n2, 1, 1);
		pane.add(lblsum, 0, 2);
		pane.add(dsply, 1, 2);
		pane.add(sum, 2, 2);
		pane.setAlignment(Pos.CENTER);
		sum.setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		int i = Integer.parseInt(n1.getText());
		int j = Integer.parseInt(n2.getText());
		int z = i+j;      
		String sum = Integer.toString(z);       
		dsply.setText(sum);
	}
	
	
}
