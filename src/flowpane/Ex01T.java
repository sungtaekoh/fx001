package flowpane;
//복습 1
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01T extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		FlowPane flowPane = new FlowPane();
		
		for(int i =1;i<=15;i++) {
			flowPane.getChildren().add(new Button("버튼"+i));
		}
	
		
		Scene scene = new Scene(flowPane,200,100);
		stage.setScene(scene);
		
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}
