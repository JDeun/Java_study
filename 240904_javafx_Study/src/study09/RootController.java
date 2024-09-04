package study09;

import java.net.URL;  // 추가
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.beans.binding.Bindings;  // javax 대신 javafx 사용

public class RootController implements Initializable {
    @FXML private TextArea textArea1;
    @FXML private TextArea textArea2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {  // 메서드명 소문자로 시작
        Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());  // 오타 수정
    }
}
