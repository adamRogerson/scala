object question1{


  	def main(args: Array[String]) = println("Question 1 runnnning ")

	def second(a:Double,b:Double,c:Double,x:Double):Double=
	{
		Math.pow(a*x,2) + (b*x) + c
	}//end second


	val result = second(4,8,1,2)
	println(result)


        //here resultAnon = the anonymous function
        val resultAnon = (a:Int,b:Int,c:Int,x:Int) => (Math.pow(a*x,2) + (b*x) + c)
	println(resultAnon(4,8,1,2))


}
