package org.delusion.katstowerdefense.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

public class SettingsScreen extends ScreenAdapter {

    private Stage stage;

    public SettingsScreen() {
		
    }

    @Override
	public void render (float delta) {
        ScreenUtils.clear(Color.BLACK);

	}

    @Override
	public void resize (int width, int height) {
			Gdx.gl.glViewport(0,0,width,height);
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
