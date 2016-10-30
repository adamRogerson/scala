object question5{

  	def main(args: Array[String]) = println("Question 5 runnnning ")


	def higher(f:(Int,Int) => Boolean, g:Int => Boolean, x:Int,y:Int):Boolean=
	{
		//forumal writen into if stament according to S/O java follow 

		if (f(x,y) == true &   (g(x) == true || g(y) == true))
		{
			true	
		}
		else
		{
			false
		}

	}//end higher


	def curriedHigher (f:(Int,Int) => Boolean, g:Int => Boolean) (x:Int, y:Int):Boolean = 
	{
		if (f(x,y) == true &   (g(x) == true || g(y) == true))
		{
			true	
		}
		else
		{
			false
		}
	}//end curr higher


	def f(x:Int,y:Int): Boolean=
	{
		if (x<y)
		{
			true
		}
		else
		{
			false
		}
	}

	def g(x:Int): Boolean=
	{
		if (x>0)
		{
			true
		}
		else
		{
			false
		}
	}

	val x = 2
	val y = 3
	val w = 3
	val z = 3

	//part (A)
	print("Question 1:   ")
	println(higher(f,g,x,y))

	//part (B)	
	print("Question 2:   ")
	println(higher( (x,y) => if(x<y) true else false , (b => x > 0) , x, y))

	//part (C)	
	print("Question 3:   ")
	//println(curriedHigher (f,g) (x,y))


	val adam = (curriedHigher (f,g) (_:Int,_:Int) )
	print(adam)
	adam(x,y)
	print(adam)
	//println(curriedHigher (x,y) )






}//end object question 5
