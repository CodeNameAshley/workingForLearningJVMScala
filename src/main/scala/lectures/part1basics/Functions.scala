package lectures.part1basics

object Functions extends App {

  // function parameters have a name and a type
  def functionOne (parameter1: String, parameter2: Int): String = {
  // the type at the end of the line above is the type returned by the function
    parameter1 + " " + parameter2
    // implementation of function which is a single expression
  }

  // calling a function
  print(functionOne("Hello", 3))

  // compiler can figure out return types of functions - it does this by looking at the implementation of the function
  def functionWithoutAParameter(): Int = 42

  println(functionWithoutAParameter())

  // LOOPS
  def repeatingFunction(stringParameter: String, numberParameter: Int): String = {
    if(numberParameter == 1) stringParameter
    else stringParameter + repeatingFunction(stringParameter, numberParameter-1)
  }
  // deleting return type in recursive function, the compiler will complain
  // compiler cannot determine the result type of a recursive function on its own.

  println(repeatingFunction("hello", 3))
  // When loops are needed use recursion
}
