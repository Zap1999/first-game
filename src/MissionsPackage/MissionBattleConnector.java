package MissionsPackage;

import BattlePackage.BattleController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MissionBattleConnector {

    char difficulty;
    int mission;
    boolean boss;

    @FXML
    BorderPane mainPane;

    @FXML
    private BorderPane missions;

    @FXML
    public MissionsController missionsController;

    @FXML
    private BorderPane battle;

    @FXML
    public BattleController battleController;


    @FXML
    public void initialize() {
        battle.setVisible(false);
        missionsController.init(this);
    }

    public char getDifficulty() { return difficulty; }

    public int getMission() {
        return mission;
    }

    public boolean isBoss() { return boss; }

    public void startMission() {

        difficulty = missionsController.getDifficulty();
        mission = missionsController.getMission();
        boss = missionsController.isBoss();
        missions.setVisible(false);
        battle.setVisible(true);
        this.battleController.init(this);
    }

}