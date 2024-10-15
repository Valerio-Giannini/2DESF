package bouncing_ball

import view.model.Component

case class Position(var x: Double, var y: Double) extends Component
case class Speed(var vx: Double, var vy: Double)  extends Component
