object question4{

  def main(args: Array[String]) = println("Question 4 runnnning ")

  def series(n:Double):Double = {


    def equation(a0:Double,a1:Double,inc:Double):Double= 
    {
      if (inc == 0)
      {
        a1
      }
      else
      {
        val aN = Math.pow(-1,inc) * (5 * a1 ) + Math.pow(-1,(inc-1)) *  (3 * a0)

        println("prof of tail recurrsion: (aN-1 = " +a1 + ")  (aN = " + aN + ") on the (" + inc + ") run")
        //only doubles are passed into equation on call

        equation(a1,aN,inc - 1)
      }//end if/else block
    }//end equation


    //gard for 0/1/2 input
    if(n==1||n==2||n==0)
    {
      0
    }
    else
    {
      equation(3,5,n-2)
    }


  }//end series

  val result = series(6)
  println(result)


        //List(3,5,-16,-95,427)
        //sum Math.pow(-1,n) * (5 * con(1) ) + Math.pow(-1,(inc-1)) *  (3 * con(0))


}//end question 4
