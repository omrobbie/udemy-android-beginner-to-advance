package com.omrobbie.mygame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {

    private SpriteBatch spriteBatch;
    private BitmapFont bitmapFont;

    private Texture texture;
    private Sprite sprite;

    private TextureAtlas textureAtlas;
    private Animation animation;
    private float timePassed = 0;

    @Override
    public void create() {
        setupEnv();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();

        sprite.draw(spriteBatch);
        bitmapFont.draw(spriteBatch, "Firebase!", 200, 100);

        timePassed += Gdx.graphics.getDeltaTime();
        spriteBatch.draw((TextureRegion) animation.getKeyFrame(timePassed, true), 300, 500);

        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        bitmapFont.dispose();
        texture.dispose();
        textureAtlas.dispose();
    }

    private void setupEnv() {
        spriteBatch = new SpriteBatch();
        bitmapFont = new BitmapFont();
        bitmapFont.setColor(Color.ORANGE);
        bitmapFont.getData().setScale(5, 5);

        texture = new Texture("firebase.png");
        sprite = new Sprite(texture);

        textureAtlas = new TextureAtlas(Gdx.files.internal("walk.atlas"));
        animation = new Animation(1 / 3f, textureAtlas.getRegions());
    }
}
