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



	println("id = " + idGet(1))
	println("square = " + squareGet(5))
	println("cube = " + cubeGet(5))
	

	val test = 2
	//print((test:Double) => test*test)



	def higher(fun:(z*z*z), x:Double):Double =
	{
	

		3.0
	}//end higher


	

	//test question facFinder 
	val resultFact = factFinder(5)
	println("result of fact finder = " + resultFact)

	//test for series
	val resultSer = series(1,2,4)
	println("result of Series = " + resultSer)

}
