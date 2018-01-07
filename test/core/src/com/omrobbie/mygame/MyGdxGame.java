package com.omrobbie.mygame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

public class MyGdxGame extends ApplicationAdapter implements GestureDetector.GestureListener {

    private SpriteBatch spriteBatch;
    /*private BitmapFont bitmapFont;

    private Texture texture;
    private Sprite sprite;

    private TextureAtlas textureAtlas;
    private Animation animation;
    private float timePassed = 0;*/

    @Override
    public void create() {
        setupEnv();
    }

    @Override
    public void render() {
        /*Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();

        sprite.draw(spriteBatch);
        bitmapFont.draw(spriteBatch, "Firebase!", 200, 100);

        timePassed += Gdx.graphics.getDeltaTime();
        spriteBatch.draw((TextureRegion) animation.getKeyFrame(timePassed, true), 300, 500);

        spriteBatch.end();*/
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        /*bitmapFont.dispose();
        texture.dispose();
        textureAtlas.dispose();*/
    }

    /**
     * @param x
     * @param y
     * @param pointer
     * @param button
     * @see InputProcessor#touchDown(int, int, int, int)
     */
    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        return false;
    }

    /**
     * Called when a tap occured. A tap happens if a touch went down on the screen and was lifted again without moving outside
     * of the tap square. The tap square is a rectangular area around the initial touch position as specified on construction
     * time of the {@link GestureDetector}.
     *
     * @param x
     * @param y
     * @param count  the number of taps.
     * @param button
     */
    @Override
    public boolean tap(float x, float y, int count, int button) {
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    /**
     * Called when the user dragged a finger over the screen and lifted it. Reports the last known velocity of the finger in
     * pixels per second.
     *
     * @param velocityX velocity on x in seconds
     * @param velocityY velocity on y in seconds
     * @param button
     */
    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    /**
     * Called when the user drags a finger over the screen.
     *
     * @param x
     * @param y
     * @param deltaX the difference in pixels to the last drag event on x.
     * @param deltaY the difference in pixels to the last drag event on y.
     */
    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    /**
     * Called when no longer panning.
     *
     * @param x
     * @param y
     * @param pointer
     * @param button
     */
    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    /**
     * Called when the user performs a pinch zoom gesture. The original distance is the distance in pixels when the gesture
     * started.
     *
     * @param initialDistance distance between fingers when the gesture started.
     * @param distance        current distance between fingers.
     */
    @Override
    public boolean zoom(float initialDistance, float distance) {
        return false;
    }

    /**
     * Called when a user performs a pinch zoom gesture. Reports the initial positions of the two involved fingers and their
     * current positions.
     *
     * @param initialPointer1
     * @param initialPointer2
     * @param pointer1
     * @param pointer2
     */
    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    /**
     * Called when no longer pinching.
     */
    @Override
    public void pinchStop() {

    }

    private void setupEnv() {
        spriteBatch = new SpriteBatch();
        /*bitmapFont = new BitmapFont();
        bitmapFont.setColor(Color.ORANGE);
        bitmapFont.getData().setScale(5, 5);

        texture = new Texture("firebase.png");
        sprite = new Sprite(texture);

        textureAtlas = new TextureAtlas(Gdx.files.internal("walk.atlas"));
        animation = new Animation(1 / 3f, textureAtlas.getRegions());*/
    }
}
