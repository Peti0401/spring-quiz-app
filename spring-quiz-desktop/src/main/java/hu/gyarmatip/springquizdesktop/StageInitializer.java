package hu.gyarmatip.springquizdesktop;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<ApplicationMain.StageReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationMain.StageReadyEvent event) {
        Stage stage = event.getStage();

        Parent pane = new Pane();
        Scene scene = new Scene(pane, 1080, 720);
        stage.setScene(scene);
        stage.show();
    }
}
