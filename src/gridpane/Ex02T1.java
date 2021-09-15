package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//GridPane복습
public class Ex02T1 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button button = new Button("Button");
		GridPane.setConstraints(button, 0, 0);
		
		Label label= new Label("label");
		GridPane.setConstraints(label, 1, 1);
		
		gridPane.getChildren().addAll(button,label);
		Button btn = new Button("1,0");
		gridPane.add(btn, 1, 0);//constraints+getChildren().add
		gridPane.add(new Label("0,1"), 0, 1);
		
//		gridPane.setPadding(new Insets(20) );
//		gridPane.setHgap(50);
//		gridPane.setVgap(10);
		arg0.setScene(new Scene(gridPane, 300,300) );
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0),row(2)") );
		
//		flowPane.setStyle("-fx-background-color:black;");
//		flowPane.setAlignment(Pos.CENTER);
		
		gridPane.add(flowPane, 0, 2,2,1);
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	
}
