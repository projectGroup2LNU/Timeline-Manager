package main;

import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.TimelineContainer;
import view.MainView;

/**
 * Main class that sets up the TimelineManager to run.
 * 
 * @author Jesper Bergstr�m and Zacky Kharboutli
 * @version 0.00.00
 * @name TimelineManager.java
 */
public class TimelineManager extends Application {

	private static MainView ui;
	
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(ui);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		ui = new MainView();
		TimelineContainer timelineContainer = new TimelineContainer();
		MainController mainController = new MainController(ui, timelineContainer);
		mainController.setupListeners();
		
		launch(args);	
	}

}
