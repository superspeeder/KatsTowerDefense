package org.delusion.katstowerdefense.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.utils.ScreenUtils;

import org.delusion.katstowerdefense.KatsTowerDefense;

public class InGameScreen extends ScreenAdapter {

    private static final float STARTING_PLAYABLE_RADIUS = 100.0f;
    private static final float RADIUS_GROWTH_PER_ROUND = 50.0f;
    private static final int ROUND_MONETARY_BONUS = 50;
    private static final int STARTING_CASH = 50;
    private static final int TOTAL_ROUNDS = 10;
    
    private int roundNumber;
    private int money;

    private Circle playableArea;
    private KatsTowerDefense game;

    private ShapeRenderer shapeRenderer;


    public InGameScreen(KatsTowerDefense game) {
        this.game = game;
        roundNumber = 0;
        money = STARTING_CASH;
        playableArea = new Circle(Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth() / 2, STARTING_PLAYABLE_RADIUS);

        shapeRenderer = new ShapeRenderer();
        Gdx.graphics.
    }

    public void nextRound() {
		
        money += ROUND_MONETARY_BONUS;
        playableArea.setRadius(playableArea.radius + RADIUS_GROWTH_PER_ROUND);
    } 


    @Override
	public void render (float delta) {

        ScreenUtils.clear(Color.BLACK);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(0.2f, 1.0f, 0.411764706f, 0.5f);
        shapeRenderer.circle(playableArea.x, playableArea.y, playableArea.radius);
        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);
        shapeRenderer.setColor(0.2f, 1.0f, 0.411764706f, 0.9f);
        shapeRenderer.circle(playableArea.x, playableArea.y, playableArea.radius);
        shapeRenderer.end();

    }

    @Override
	public void resize (int width, int height) {
        Gdx.gl.glViewport(0,0,width,height);
        playableArea.setPosition(Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth() / 2);
	}

	@Override
	public void show () {
	}

	@Override
	public void hide () {
	}

	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}

	@Override
	public void dispose () {

    }
    
}
