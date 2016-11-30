object question2{






  def main(args: Array[String]) = println("Question 5 runnnning ")

    def g(x: Double) =
    {
      println("G reult of g given x = " + x + " = " + (x + 1))
      x+1
    }


    def h(x: => Int) =
    {
      println(("H result of g(x) given x = " +  x)  + g(x))
      println(("H result of h given x = " + x) + g(x) * (x - 1))
      g(x) * x - 1
    }

    def f(x: => Double, y: => Int) =
    {
      println("F result of g(x) in f " + g(x))
      println("F result of h(y) in f " + h(y))
      g(x) + h(y)

    }

    val endResult = f(2.0 + 3.0, 2 * 2)

    println(endResult)



}//end object question 2
