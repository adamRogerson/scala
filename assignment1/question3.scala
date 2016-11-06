object question3{

  def main(args: Array[String]) = println("Question 3 runnnning ")


    def fibonacci(n:Int):Int=
    {
      if (n>0)
      {
        return n
      }
      else
      {
        fibonacci(fibonacci(n-1) + fibonacci(n-2))
        //each call of fib will create 2 more calls to fib until it can reslove the entire stack to 1|0
      }
    }//end fib

    println( "result of Q3 = " + fibonacci(5))
}//end question 3
