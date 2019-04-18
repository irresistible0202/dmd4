package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

public class Fon {

    private Texture tx;
    private Vector2 pos;
    private int speed;


    public Fon(){
        tx = new Texture("Fon.jpg");
        pos = new Vector2(0,0);
        speed = 4;
    }

    public void render(SpriteBatch batch){
        batch.draw(tx, pos.x, pos.y);

    }

    public void update(){

    }


}
