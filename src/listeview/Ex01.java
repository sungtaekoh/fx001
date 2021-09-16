package listeview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1","item2","item3");
		listView.setPrefSize(300,200);
		ap.getChildren().add(listView);
		
		arg0.setScene(new Scene(ap,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
