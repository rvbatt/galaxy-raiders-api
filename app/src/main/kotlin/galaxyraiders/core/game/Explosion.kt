package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  var time: Int = 1000,
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double
) :
  SpaceObject("Explosion", '*', initialPosition, initialVelocity, radius, mass)
{
  fun over(): Boolean {
    time -= 1
    if (time == 0) {
      return true
    }
    return false
  }
}
