package com.lodenrogue.rogue;

import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

/**
 * Array extension. Contains capabilities to call entity render and update
 * methods and search/return entities by id.
 * 
 * @author Miguel Hernandez
 *
 */

public class EntityArray extends Array<Entity> {
	private HashMap<String, Entity> entityHashMap;

	public EntityArray() {
		super();
		entityHashMap = new HashMap<String, Entity>();
	}

	/**
	 * Appends the specified entity to the end of this array. Also places
	 * the entity in a hash map.
	 */

	@Override
	public void add(Entity e) {
		super.add(e);
		entityHashMap.put(e.getId(), e);
	}

	/**
	 * Calls the update method for each entity in the array.
	 */
	public void updateAll() {
		for (Entity e : this) {
			e.update();
		}
	}

	/**
	 * Calls the render method for each entity in the array.
	 * 
	 * @param batch SpriteBatch used for render method.
	 */
	public void renderAll(SpriteBatch batch) {
		for (Entity e : this) {
			e.render(batch);
		}
	}

	/**
	 * Removes every entity from this array.
	 */
	public void removeAll() {
		removeAll();
		entityHashMap.clear();
	}

	/**
	 * Removes a specified entity from the array.
	 * 
	 * @param e Entity to be removed.
	 */
	public void removeEntity(Entity e) {
		removeValue(e, false);
		entityHashMap.remove(e.getId());
	}

	/**
	 * Calls the dispose method of all entities in this array.
	 */
	public void disposeAll() {
		for (Entity e : this) {
			e.dispose();
		}
	}

	/**
	 * Returns an entity identified by it's id.
	 * 
	 * @param id Id of the target entity.
	 * @return Returns the entity associated with the id.
	 */
	public Entity getEntityById(String id) {
		return entityHashMap.get(id);
	}

	/**
	 * Returns the first instance of an entity containing an id that matches
	 * the partialID. Returns null if none is found.
	 * 
	 * @param partialID Partial string id to match with entity.
	 * @return Return entity or null if none found.
	 */
	public Entity findFirstInstanceOf(String partialID) {
		for (Entity e : this) {
			if (e.getId().contains(partialID)) {
				return e;
			}
		}

		return null;
	}
}