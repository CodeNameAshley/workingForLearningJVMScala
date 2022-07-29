package lectures.part1basics

object Expressions extends App {
  val mathExpression = 1 + 2 // This is an expression and the evaluation is given a type
  println(mathExpression)

  println(2 + 3 * 4)
  // + - * / and Bitwise & | ^ << >> >>> (right shift with zero extension)

  println(1 == mathExpression)
  // == != > >= < <=

  println(!(1 == mathExpression))
  // ! && ||

  var variableOne = 2
  variableOne += 3
  println(variableOne)

  // Instructions (DO) vs Expressions

  // IF expressions
  val conditionOne = true
  val conditionedValue = if(conditionOne) 5 else 3 // IF EXPRESSION
  println(conditionedValue)
  // If in scala is always an EXPRESSION

  // while loops
  var iterator = 0
  while (iterator < 10) {
    println(iterator)
    iterator += 1
  }
  // Never write this again
  // Everything in Scala is an expression

  val weirdValue = (variableOne = 3) // unit === void
  println(variableOne)

  // side effects: println(), whiles, reassigning
  // they are expressions returning units

  // Code Blocks
  val codeBlock = {
    val firstVal = 2
    val secondVal = firstVal + 1

    if (secondVal > 2) "Hello" else "Goodbye"
  }
  // Scope still applies here. firstVal is not available outside of the code block

}
