package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		 Label lb = new Label("Hello World!!");//Label 에서 javaFX를 사용할것
		 lb.setFont(new Font(20) );//글씨
		 
		 Scene scene = new Scene(lb, 200,100/*사이즈 가로,세로*/);//장판
		 //씬은 한개만 생성가능 
		
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");//말그대로 창의 이름을 세운다 타이틀
		arg0.show();//화면을 띄워라
	}
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);//메인에러 런츠를 호출
	
		
		
		
		
		
	}

	
}
