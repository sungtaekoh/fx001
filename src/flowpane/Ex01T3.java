package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01T3 extends Application{

	@Override
	public void start(Stage stage) throws Exception {

		FlowPane pane = new FlowPane();
		
		for(int i=1;i<15;i++) {
			pane.getChildren().add(new Button("버튼입니다"+i));
		}
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		stage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}


}
