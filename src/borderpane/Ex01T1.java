package borderpane;
//복습 1
// 보더펜 : 위 아래 왼 오 방향으로 칸과 버튼이 만들어진다
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex01T1 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Button bTop = new Button("Top");
		Button bCenter = new Button("Center");
		Button bBottom = new Button("Bottom");
		Button bLeft = new Button("Left");
		Button bRight = new Button("Right");
		
		BorderPane bp = new BorderPane();
		
		bp.setTop(bTop);
		bp.setCenter(bCenter);
		bp.setBottom(bBottom);
		bp.setLeft(bLeft);
		bp.setRight(bRight);
		
		arg0.setScene(new Scene(null));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
