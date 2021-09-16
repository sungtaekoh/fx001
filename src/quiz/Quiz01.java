package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		
		Label labelMenu = new Label();
		labelMenu.setText("메뉴");
		
		Label labelHome = new Label("홈");
		Label labelLogin = new Label("로그인");
		//위쪽 펜
		FlowPane topPane = new FlowPane();
		topPane.getChildren().addAll(labelMenu,labelHome,labelLogin);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(20);
		bp.setTop(topPane);
		topPane.setPadding(new Insets(10,30,10,0) );//위,오,아,왼//배경색도 같이 늘어난다
		topPane.setStyle("-fx-background-color:pink;");
		bp.setTop(topPane);
		
		//왼쪽
		Button leftBtn = new Button("메뉴 나열");
		FlowPane leftPane = new FlowPane();
		leftPane.getChildren().addAll(leftBtn);
		bp.setStyle("-fx-background-color:skyblue;");
		leftPane.setPrefSize(100,300);
		bp.setLeft(leftPane);
		
		
		
		arg0.setScene(new Scene(bp,500,400));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}



}
