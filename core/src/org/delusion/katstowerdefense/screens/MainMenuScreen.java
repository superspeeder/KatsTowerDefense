package org.delusion.katstowerdefense.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.kotcrab.vis.ui.widget.VisTextButton;

import org.delusion.katstowerdefense.KatsTowerDefense;

public class MainMenuScreen extends ScreenAdapter {

    private Stage stage;
    private VisTextButton playButton;
    private VerticalGroup buttonGroup;
	private KatsTowerDefense game;

    public MainMenuScreen(KatsTowerDefense game) {
		
        this.game = game;
		stage = new Stage();
		
        buttonGroup = new VerticalGroup();
        buttonGroup.setFillParent(true);

        playButton = new VisTextButton("Play");
		playButton.addListener(new ChangeListener() {

			@Override
			public void changed(ChangeEvent event, Actor actor) {
				game.setScreen(game.getIngameScreen());
			}
			
		});
        
        buttonGroup.addActor(playButton);
        stage.addActor(buttonGroup);
    }

    @Override
	public void render (float delta) {
        stage.act(delta);

        ScreenUtils.clear(Color.BLACK);
        stage.draw();
	}

    @Override
	public void resize (int width, int height) {
		Gdx.gl.glViewport(0,0,width,height);
	}

	@Override
	public void show () {

		Gdx.input.setInputProcessor(stage);
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
		stage.dispose();
	}
}
