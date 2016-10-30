object lab4 {
  	def main(args: Array[String]) = println("Ho!")


	def factFinder(oper:Int): Int=
	{
		def cal(oper:Int,factSum:Int): Int=
		{
			if (oper <= 1)
				factSum

			else
				cal(oper-1,(factSum*oper))
                }
		if (oper == 0)
			1
		else
			cal(oper,1)

	}//end factorial finder

	def series(start:Int,ratio:Int,end:Int): Int=
	{
		if (end <= 1)
			start
		else
			series((start*ratio),ratio,end-1)

	}//end series

	def idGet(id:Double) :Double =
	{
		id
	}//end id

	def squareGet (id:Double) :Double =
	{
		id*id
	}//end square

	def cubeGet (id:Double) :Double =
	{
		id*id*id
	}//end cube

        def higher(f:Double=>Double,a:Double) :Double =
        {
          (f(a)*2)-1
        }//end higher


        //q 11
        (x:Double,y:Double) => Math.pow(x,y)

        println((1,2))

        //tests for higher
        println("id = "     + higher(x=> x,1))
        println("square = " + higher(x=> x*x,5))
        println("cube = "   + higher(x=> x*x*x,5))

        //tests for id ,square, cube
	//println("id = " + idGet(1))
	//println("square = " + squareGet(5))
	//println("cube = " + cubeGet(5))

	//test question facFinder
	//val resultFact = factFinder(5)
	//println("result of fact finder = " + resultFact)

	//test for series
	val resultSer = series(1,2,4)
	//println("result of Series = " + resultSer)

}
