package com.lodenrogue.rogue;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Render component interface.
 * 
 * @author Miguel Hernandez
 *
 */

public interface RenderComponent {

	public void render(Entity entity, SpriteBatch batch);
}
