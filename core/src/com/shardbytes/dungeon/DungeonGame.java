package com.shardbytes.dungeon;

import com.badlogic.gdx.Game;

public class DungeonGame extends Game{
	
	
	@Override
	public void create(){
		
		setScreen(new DungeonScreen());
	
	
	}
	
	@Override
	public void dispose(){
	
		super.dispose();
	}
}
