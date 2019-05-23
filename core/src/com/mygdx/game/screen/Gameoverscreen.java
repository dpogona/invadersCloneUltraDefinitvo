package com.mygdx.game.screen;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Controls;
import com.mygdx.game.SpaceInvaders;
import com.mygdx.game.objects.World;

public class Gameoverscreen extends SpaceInvadersScreen{
    BitmapFont bitmapFont;
    SpriteBatch batch;



    public Gameoverscreen(SpaceInvaders game) {
        super(game);
    }

    @Override
    public void show() {
        bitmapFont = new BitmapFont();
        batch = new SpriteBatch();

    }

    @Override
    public void render(float delta) {
        batch.begin();
        bitmapFont.draw(batch, "Suckeas", 300, 300);
        bitmapFont.draw(batch, "Quieres volver a jugar?", 300, 300);
        batch.end();

    }
}
