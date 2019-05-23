package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Interfaz {
    Ship ship;
    AlienArmy alienArmy;
    BitmapFont bitmapFont;

    Interfaz(Ship ship, AlienArmy alienArmy){
        this.ship = ship;
        this.alienArmy = alienArmy;
        bitmapFont = new BitmapFont();
    }

    void render(SpriteBatch batch){
        bitmapFont.draw(batch, "Vidas: " + ship.vidas, 0, 250);
        bitmapFont.draw(batch, "Score: " + ship.puntos, 305, 250);


    }
}
