package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Database.DB;
import Database.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * Koment sluzi na skusku na git hub
 */
public class SnakeFxController implements Initializable {

	@FXML
	private TextArea textArea;
	@FXML
	private TextField playerName;
	@FXML
	private Pane basePane;
	@FXML
	private Pane panePlayerName;
	@FXML
	private Pane optionPane;
	@FXML
	private Button btnWhite;
	@FXML
	private Button btnBlack;
	@FXML
	private Button btnOk;
	@FXML
	private Button btnOption;

	private static final int BLACK_BACKGROUND_COLOR = 1;
	private static final int WHITE_BACKGROUND_COLOR = 2;

	private Game game;
	private DB db = new DB();
	private ArrayList<Player> players;
	private String setPlayerName;
	public static int backgroundColor = 1;

	@FXML
	public void btnNewGame(ActionEvent event) {
		basePane.setDisable(true);
		basePane.setOpacity(0.3);
		panePlayerName.setVisible(true);

		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				setPlayerName = playerName.getText();
				if (!setPlayerName.isEmpty()) {
					game = new Game(setPlayerName);
					game.run();
					basePane.setDisable(false);
					basePane.setOpacity(1);
					panePlayerName.setVisible(false);
					playerName.setText("");
				}
			}
		});
		setTextArea();
	}

	@FXML
	public void btnQuit(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void btnOption(ActionEvent event) {
		basePane.setVisible(false);
		optionPane.setVisible(true);

		btnWhite.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				optionPane.setVisible(false);
				basePane.setVisible(true);
				backgroundColor = WHITE_BACKGROUND_COLOR;
			}
		});

		btnBlack.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				optionPane.setVisible(false);
				basePane.setVisible(true);
				backgroundColor = BLACK_BACKGROUND_COLOR;
			}
		});
	}

	@FXML
	public void btnReset(ActionEvent event) {
		for (Player player : players) {
			db.removePlayer(new Player(player.getMeno()));
		}
		setTextArea();
	}

	@FXML
	public void btnRefresh(ActionEvent event) {
		setTextArea();
	}

	public void setTextArea() {
		players = db.getAllPlayers();
		players.sort(Player.PODLA_SKORE);

		String result = "";
		int lineCounter = 0;
		result += String.format("%-3s%10s%10s", "n.", "name:", "score:") + "\n";
		result += "----------------------------\n";
		for (Player player : players) {
			lineCounter++;
			result += String.format("%-5s%10s%10s", lineCounter + ".", player.getMeno(), player.getScore()) + "\n";
		}
		textArea.setText(result);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setTextArea();
	}
}
