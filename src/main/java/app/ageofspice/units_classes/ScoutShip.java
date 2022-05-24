package app.ageofspice.units_classes;

import app.ageofspice.MapController;
import app.ageofspice.Resourcesandcosts.*;
import app.ageofspice.TileType;
import app.ageofspice.movement.ActualPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static app.ageofspice.TileType.SCOUT_SHIP;

/**
 * Szybka jednostka.
 * Statystyki które musi mieć.
 * -Mało hp
 * -Mało dmg
 * -Duzo movspeeda;
 * -Tani
 */

public class ScoutShip extends unit{
    public ScoutShip(){
        baseDMG = 5;
        baseHP = 20;
        shipType = SCOUT_SHIP;
        movementSpeed = 3;
        movementSpeedleft = movementSpeed;
        actualHP = baseHP;
        baseCost = new Cost(new AlgiRes(10),new SpiceRes(20),new VibraniumRes(30),new CrystalRes(30));
    }
    @Override
    public void imageviewconstructor(String imview) {
        this.imageView = new ImageView();
        this.imageView.setFitHeight(MapController.TILE_SIZE);
        this.imageView.setFitWidth(MapController.TILE_SIZE);
        this.imageView.relocate(position.x * MapController.TILE_SIZE, position.y * MapController.TILE_SIZE);
        this.imageView.setImage(new Image(String.valueOf(getClass().getResource(imview))));
        MapController.staticPane.getChildren().add(this.imageView);

    }
}


