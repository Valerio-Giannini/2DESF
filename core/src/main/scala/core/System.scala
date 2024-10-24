package core

/** This trait represents a generic system in an ECS (Entity-Component-System) architecture.
  *
  * A [[System]] operates on entities within the [[World]], updating their components based on the
  * current state. Each concrete implementation of this trait will
  * define specific logic to update entities' components.
  */
trait System:
  /** Update the entities within the [[World]].
    *
    * @param world
    *   the [[World]] containing the entities and their components.
    */
  def update(world: World): Unit
