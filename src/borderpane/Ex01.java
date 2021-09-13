package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
	Button bTop =new Button("Top");
	Button bCenter = new Button("Center");
	Button bBottom = new Button("Bottom");
	Button bLeft = new Button("Left");
	Button bRight = new Button("Right");
	
	BorderPane dp = new BorderPane();
	
	dp.setTop(bTop);
	dp.setCenter(bCenter);
	dp.setBottom(bBottom);
	dp.setLeft(bLeft);
	dp.setRight(bRight);
	
	bTop.setPrefSize(300, 20);
	
	arg0.setResizable(false);//사이즈를 고정시켜준다 깨지지않는다
	
	arg0.setScene(new Scene(dp, 300,100));
		
			arg0.show();
		
	}
	public static void main(String[] args) {
	launch(args);	
	}

	

}
