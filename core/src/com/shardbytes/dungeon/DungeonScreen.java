package com.shardbytes.dungeon;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DungeonScreen implements Screen{
	
	private Sprite player = new Sprite(new Texture(Gdx.files.internal("badlogic.jpg")));
	private SpriteBatch batch = new SpriteBatch();
	private OrthographicCamera camera = new OrthographicCamera();
	
	public DungeonScreen(){ //constructor
		player.setPosition(1f,1f);
		
	}
	
	
	@Override
	public void render(float delta){
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		
		Gdx.gl.glClearColor(0f,0f,0f,0f); //backround
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //clear
		
		batch.begin();
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void resize(int width, int height){
	camera.update();
	}
	
	@Override
	public void show(){
	
	}
	
	@Override
	public void pause(){
	
	}
	
	@Override
	public void resume(){
	
	}
	
	@Override
	public void hide(){
	
	}
	
	@Override
	public void dispose(){
	
	}
}
