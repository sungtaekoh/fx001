package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01T3 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		gridPane.setConstraints(btn,0,0);
		
		Label label = new Label("label");
		Label label02 = new Label("label02");
		
		gridPane.setConstraints(label02, 1, 1);
		gridPane.setConstraints(label, 0, 2);
		
		gridPane.getChildren().addAll(btn, label, label02);
		
		arg0.setScene(new Scene(gridPane,300,300) );
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}
