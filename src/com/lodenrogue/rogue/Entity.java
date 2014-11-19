package com.lodenrogue.rogue;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Interface representing a game entity.
 * 
 * @author Miguel Hernandez
 *
 */

public interface Entity {

	/**
	 * Set the main update component.
	 * 
	 * @param updateComponent Main update component for this entity.
	 */
	public void setUpdateComponent(UpdateComponent updateComponent);

	/**
	 * Handle the update component update method.
	 */
	public void update();

	/**
	 * Set the main render component.
	 * 
	 * @param renderComponent Main render component for this entity.
	 */
	public void setRenderComponent(RenderComponent renderComponent);

	/**
	 * Handle the render component render method.
	 * 
	 * @param batch SpriteBatch used with the render component.
	 */
	public void render(SpriteBatch batch);

	/**
	 * Get the id associated with this entity.
	 * 
	 * @return Returns a String id.
	 */
	public String getId();

	/**
	 * Sets the id associated with this entity.
	 * 
	 * @param id String id used to identify this entity.
	 */
	public void setId(String id);

	/**
	 * Set the x and y position values.
	 * 
	 * @param x The x value of the entity position.
	 * @param y The y value of the entity position.
	 */
	public void setPosition(float x, float y);

	/**
	 * Set the position of this entity.
	 * 
	 * @param postion Vector2 object representing the position.
	 */
	public void setPosition(Vector2 position);

	/**
	 * Get the position of this entity.
	 * 
	 * @return Returns a Vector2 object representing the position values.
	 */
	public Vector2 getPosition();

	/**
	 * Set the sprite for this entity.
	 * 
	 * @param sprite
	 */
	public void setSprite(Sprite sprite);

	/**
	 * Get the sprite for this entity.
	 * 
	 * @return Returns the entity sprite.
	 */
	public Sprite getSprite();

	/**
	 * Dispose all entity resources here.
	 */
	public void dispose();

}
