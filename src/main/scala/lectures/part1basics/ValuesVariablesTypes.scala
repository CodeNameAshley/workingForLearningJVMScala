package lectures.part1basics

object ValuesVariablesTypes extends App {
  val numberVariable: Int = 42

  println(numberVariable)

  /* variables declared using val are immutable they cannot be changed using
  numberVariable = 2
  The compiler will produce an error
  */

  /* Types of vals are optional, if the type is not specified
  val numberVariable = 42 (hover over will be an int)
  the compiler will infer types by checking the data on the right hand side
  */

  val stringValue: String = "Hello"
  val stringValue2 = "Goodbye"

  val booleanValue: Boolean = false
  val characterValue: Char = 'A'
  val integerValue: Int = numberVariable
  val shortValue: Short = 4613
  val longValue: Long = 461345633879287L
  val floatValue: Float = 2.0f
  val doubleValue: Double = 3.14

  // Variables in Scala
  // can be reassigned
  var variableOne: Int = 4
  variableOne = 5

}
