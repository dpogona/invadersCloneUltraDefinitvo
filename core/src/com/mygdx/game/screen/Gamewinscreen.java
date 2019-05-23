package com.mygdx.game.screen;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.SpaceInvaders;

public class Gamewinscreen extends SpaceInvadersScreen {
    BitmapFont bitmapFont;
    SpriteBatch batch;

    public Gamewinscreen(SpaceInvaders game) {
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
        bitmapFont.draw(batch, "Ganaste :D ", 300, 300);
        batch.end();

    }
}
