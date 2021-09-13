package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01T2 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		FlowPane pane = new FlowPane();
		
		for(int i=1;i<15;i++) {
		 pane.getChildren().add(new Button("버튼"+i));
		}
		
		Scene scene = new Scene(pane,300,150);
		
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}
