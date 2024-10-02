package mate.academy.model

import mate.academy.service.Figure

class RightTriangle(
    override val color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure {

    override fun getArea(): Double = 0.5 * firstLeg * secondLeg

    override fun draw() = println("Figure: triangle, area: ${getArea()} sq. units, " +
            "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
}