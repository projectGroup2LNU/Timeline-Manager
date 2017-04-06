package timeline;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class that sets up the TimelineManager to run.
 * 
 * @author Jesper Bergstr�m
 * @version 0.00.00
 * @name TimelineManager.java
 */
public class TimelineManager extends Application {

	@Override
	public void start(Stage primaryStage) {

		UserInterface ui = new UserInterface();

		Scene scene = new Scene(ui);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}
