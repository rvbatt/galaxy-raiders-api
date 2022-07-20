package galaxyraiders.core.physics

data class Point2D(val x: Double, val y: Double) {
  operator fun plus(p: Point2D): Point2D {
    return Point2D(p.x + this.x, p.y + this.y)
  }

  operator fun plus(v: Vector2D): Point2D {
    return Point2D(v.dx + this.x, v.dy + this.y)
  }

  override fun toString(): String {
    return "Point2D(x=$x, y=$y)"
  }

  fun toVector(): Vector2D {
    return Vector2D(this.x, this.y)
  }

  fun impactVector(p: Point2D): Vector2D {
    return Vector2D(Math.abs(p.x - this.x), Math.abs(p.y - this.y))
  }

  fun impactDirection(p: Point2D): Vector2D {
    return impactVector(p).normal
  }

  fun contactVector(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun contactDirection(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun distance(p: Point2D): Double {
    return INVALID_DOUBLE
  }
}
