import javafx.application.Application;
import javafx.geometry.Pos;



import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

import javafx.scene.shape.Rectangle;


import javafx.stage.Stage;
 
public class UIStackPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("StackPaneEx"); //타이틀 설정

        StackPane root = new StackPane(); //StackPane 생성

 

        //사각형 생성//

        Rectangle helpIcon = new Rectangle(60.0, 50.0);         
        helpIcon.setFill(new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE,
                new Stop[]{
                new Stop(0,Color.web("#4977A3")),
                new Stop(0.5, Color.web("#B0C6DA")),
                new Stop(1,Color.web("#9CB6CF")),}));
        //사각형을 어떻게 채울 것인지 설정. 그라디언트 효과에를 쓰고모서리를 둥글게 깎았는데, 자세한 설명은 다른 글에서 다룰 예정


            helpIcon.setStroke(Color.web("#D0E6FA")); //모서리 선분처리 설정
            helpIcon.setArcHeight(3.5);
            helpIcon.setArcWidth(3.5);
       

        //사각형 생성 끝//


        root.getChildren().add(helpIcon); //만든 사각형 추가

  root.setAlignment(Pos.CENTER); //사각형의 위치 설정

        primaryStage.setScene(new Scene(root,300,250)); //배경 크기 설정
        primaryStage.show();
    }
}



