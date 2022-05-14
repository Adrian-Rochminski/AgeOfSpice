package app.ageofspice;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ParentalStation extends ImageView {

    public static final int BASIC_HP = 1000;
    private TileType parentalStationType;
    private double HP;

    public double getHP(){ return this.HP; }
    public void setHP(double newHP){ this.HP = newHP; }

    public ParentalStation(int x, int y, TileType parentalStationType){
        this.setFitWidth(MapController.TILE_SIZE);
        this.setFitHeight(MapController.TILE_SIZE);
        this.relocate(x * MapController.TILE_SIZE, y * MapController.TILE_SIZE);

        this.parentalStationType = parentalStationType;
        this.HP = BASIC_HP;

        // ################################# Grafika planet do zamieszczenia
        switch(this.parentalStationType){
            case JAV_PARENTAL_STATION -> this.setImage(new Image(String.valueOf(getClass().getResource("arts\\Javalerzy_parental_station.png"))));
            case LUD_PARENTAL_STATION -> this.setImage(new Image(String.valueOf(getClass().getResource("arts\\Ludzie_parental_station.png"))));
            case SZR_PARENTAL_STATION -> this.setImage(new Image(String.valueOf(getClass().getResource("arts\\Szrungale_parental_station.png"))));
        }
    }
}