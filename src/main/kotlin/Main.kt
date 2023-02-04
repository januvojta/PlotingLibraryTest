import org.jetbrains.letsPlot.export.ggsave
import org.jetbrains.letsPlot.geom.geomDensity
import org.jetbrains.letsPlot.intern.Plot
import org.jetbrains.letsPlot.letsPlot

fun main(args: Array<String>) {
    println("Hello World!")

    val p = createPlot()
    ggsave(p,"test_plot.svg")
}

fun createPlot(): Plot {
    val rand = java.util.Random()
    val n = 200
    val data = mapOf<String, Any>(
        "x" to List(n) { rand.nextGaussian() }
    )

    return letsPlot(data) + geomDensity(
        color = "dark-green",
        fill = "green",
        alpha = .3,
        size = 2.0
    ) { x = "x" }
}