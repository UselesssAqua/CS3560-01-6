package application;	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ChoiceBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class CS3650_GUI_Design extends Application 
{
	public Button orderButton = new Button("Place Order");
	public Button addButton = new Button("Add to Order");
	
	public Label resTitle = new Label("Welcome to Tony's Ponies!");
	public Label menuTitle = new Label("MENU");
	public Label appetizerTitle = new Label("Appetizers");
	public Label entreeTitle = new Label("Entrees");
	public Label foodName = new Label("Food Item");
	public Label foodPrice = new Label("$ Price");
	public Label foodDesc = new Label("Item Description");
	public Label total = new Label("Total Charge: ");
	
	public ChoiceBox<String> appetizers = new ChoiceBox<>();
	public ChoiceBox<String> entrees = new ChoiceBox<>();
	
	@Override
	public void start(Stage primaryStage) 
	{
		
		VBox titleBox = new VBox(450, resTitle, orderButton);
		titleBox.setPadding(new Insets(10));
		titleBox.setAlignment(Pos.TOP_CENTER);
		
		Scene scene = new Scene(titleBox, 900, 900);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Restaurant Name");
		primaryStage.show();
		
	    orderButton.setOnAction(event -> 
	    {
	    	orderButton.setVisible(false); resTitle.setVisible(false);
	    	Image image = new Image("C:\\Users\\Menen\\Downloads\\1579893.jpg");
	    	ImageView view = new ImageView(image);
	    	view.setFitWidth(100);
			view.setFitHeight(100);
	    	
	    	GridPane gridpane = new GridPane();
			gridpane.setPadding(new Insets(10));
			gridpane.setHgap(20);
			gridpane.setVgap(20);
			
			HBox nameBox = new HBox(30, foodName, foodPrice);
			VBox descriptionBox = new VBox(10, nameBox, foodDesc);
			HBox foodBox = new HBox(10, view, descriptionBox);
			
			gridpane.add(foodBox, 2, 1);
			gridpane.setAlignment(Pos.CENTER);
		
	    	VBox menuBox = new VBox(50, menuTitle, appetizerTitle, gridpane, entreeTitle);
	    	menuBox.setPadding(new Insets(10));
	    	menuBox.setAlignment(Pos.TOP_CENTER);
	    
	    	Scene scene1 = new Scene(menuBox, 900, 900);
	    	primaryStage.setScene(scene1);
	    	primaryStage.show();
	    });
		
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}