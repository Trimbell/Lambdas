fun main() {
    convert(20.0) { c: Double -> c * 1.8 + 43}
}
//fun convert(x: Double, converter: (Double) -> Double) : Double {
//    val result = converter(x)
//    println("$x is converted to $result")
//    return result
//}