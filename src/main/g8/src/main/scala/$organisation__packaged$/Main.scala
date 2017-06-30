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
   * scala> Main.not(true)
   * res0: Boolean = false
   *
   * // Multiline
   * scala> Main.not(
   *      |  false
   *      | )
   * res1: Boolean = true
   *
   * // Property testing
   * prop> (b: Boolean) => Main.not(b) == !b
   * }}}
   */
  def not(b: Boolean): Boolean = !b
}