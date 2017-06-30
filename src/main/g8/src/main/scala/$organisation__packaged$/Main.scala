package $organisation;format="lower"$

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World!!!")
  }

  /**
   * This is how to write a doctest
   *
   * # Example
   *
   * {{{
   * scala> Main.doctested(true)
   * res0: Boolean = false
   *
   * // Multiline
   * scala> Main.doctested(
   *      |  false
   *      | )
   * res1: Boolean = true
   *
   * // Property testing
   * prop> (b: Boolean) => Main.doctested(b) == !b
   * }}}
   */
  def doctested(b: Boolean): Boolean = !b
}