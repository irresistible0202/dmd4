package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class player {
    Texture img;
    Vector2 position;


    public player(){
        img = new Texture("Voin_png.png");
        position = new Vector2(100, 0);
    }

    public void render(SpriteBatch batch){
        batch.draw(img, position.x, position.y);
    }

    public void update(){

    }

}
