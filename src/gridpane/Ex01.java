package gridpane;
//복습 2 표처럼 만들어진다
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//gridpane 그리드팬(로그인창) 인덱스번호를 이용해서 접근한다
public class Ex01 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn,0,0);//가로. 세로
		//0,0에 버튼(btn) 올려라
		
		Label label = new Label("Label");
		
		
		Label label02 = new Label("Label02");
		GridPane.setConstraints(label02, 1,1);//가로, 세로
		GridPane.setConstraints(label,0,2 );//가로,세로
		//라벨 올려라
		
		gridPane.getChildren().addAll(btn,label,label02);
		
		arg0.setScene(new Scene(gridPane, 300,100) );
		
		arg0.show();

		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	
		
	}


