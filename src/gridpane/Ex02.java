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
//${javafxCompControls}
public class Ex02 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		
		Button button = new Button("Button");
		GridPane.setConstraints(button,0,0);
		
		Button btn = new Button("1,0");
		gridPane.add(btn,1,0);
		
		
		
		Label label = new Label("Label");
		GridPane.setConstraints(label, 1, 1);
		
		gridPane.getChildren().addAll(button, label);
		
		
		gridPane.add(new Label("0,1"),0,1);
		
		gridPane.setPadding(new Insets(20) );//위 오 아 왼 모두 20
		
		gridPane.setVgap(10);
		gridPane.setHgap(50);
		
		arg0.setScene(new Scene(gridPane, 300,300));
		
//		/*
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0),row(2)"));//버튼
		flowPane.setStyle("-fx-background-color:black;");//색상을 주다 디자인하다
//		flowPane.setAlignment(Pos.CENTER);//위치
		gridPane.add(flowPane,0,2,2,1);//가로 세로 가로병합 세로병합
//		*/
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	
}









