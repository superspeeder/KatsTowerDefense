package org.delusion.katstowerdefense;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.kotcrab.vis.ui.VisUI;
import com.kotcrab.vis.ui.VisUI.SkinScale;

import org.delusion.katstowerdefense.screens.InGameScreen;
import org.delusion.katstowerdefense.screens.MainMenuScreen;

public class KatsTowerDefense extends Game {

	private MainMenuScreen mainMenuScreen;
	private InGameScreen ingameScreen;

	@Override
	public void create () {
		VisUI.load(SkinScale.X2);
		
		mainMenuScreen = new MainMenuScreen(this);
		ingameScreen = new InGameScreen(this);
		
		setScreen(mainMenuScreen);
	}

	@Override
	public void dispose () {
		mainMenuScreen.dispose();

		VisUI.dispose();
	}

	public Screen getIngameScreen() {
		return ingameScreen;
	}
}
