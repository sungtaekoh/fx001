package gridpane;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01T1 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		GridPane pane = new GridPane();
		
		Button btn = new Button("Button");
		pane.setConstraints(btn, 10,10);
		
		Label label = new Label("label");
		Label label02 = new Label("label02");
		
		pane.setConstraints(label, 1, 1);
		pane.setConstraints(label02, 0, 2);
		
		pane.getChildren().addAll(btn,label,label02);
		
		
		Scene scene = new Scene(pane,300,300);
		stage.setScene(scene);
		
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}
