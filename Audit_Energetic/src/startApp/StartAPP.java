package startApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import anexa1.CautareInFisier;
import anexa1.CitireFisier;
import anexa1.DbCon;
import anexa1.Finder;
public class StartAPP{ //extends Application {

	public static void main(String[] args) throws IOException {
		//launch(args);
		/*CitireFisier a = new CitireFisier();
		String locatie = "C:\\Users\\radum\\Desktop\\Anexa1.txt";
		String exemplu = a.citireFisier(locatie);
		System.out.println(exemplu.substring(1, 26));*/
		CautareInFisier b = new CautareInFisier();
	//	b.cautare();
		Finder c = new Finder();
		String test = "asfaltic^[";
		System.out.println(c.findObject(test));
		DbCon d= new DbCon();
		d.openConnection();
	}
/*
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("AuditExe.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("My title");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
*/
}
