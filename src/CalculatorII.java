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

public class CalculatorII extends Application implements EventHandler<ActionEvent> {

	
	Button sum = new Button("=");
	Label lblsum= new Label("Sum:");
	Label dsply= new Label();
	Label numb1 = new Label("Number 1");
	Label numb2= new Label();
	TextField n1= new TextField();
	TextField n2= new TextField();
	Button b0 = new Button("0");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	int num1=0;
	int num2=0;
	
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
		pane.add(b0,0,0);
		pane.add(b1,1,0);
		pane.add(b2,2,0);
		pane.add(b3,3,0);
		pane.add(b4,0,1);
		pane.add(b5,1,1);
		pane.add(b6,2,1);
		pane.add(b7,0,2);
		pane.add(b8,1,2);
		pane.add(b9,2,2);
		
		pane.add(numb1, 3, 4);
		pane.setAlignment(Pos.CENTER);
		sum.setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		num1 = Integer.parseInt(n1.getText());
		num2 = Integer.parseInt(n2.getText());
	    
		String sum = Integer.toString(z);       
		dsply.setText(sum);
	}

	public int calculate(int num1, int num2, String operator) {
		switch(operator) {
		case"+":
		return num1+num2;
		case"-":
			return num1-num2;
		case"*":
			return num1*num2;
		case"/":
			if(num2==0)
				return 0;
			return num1/num2;
			default:
				break;
				
		
		}
	}
}
