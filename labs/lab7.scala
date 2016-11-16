object lab7
{

	def main(args: Array[String]) = println("end lab7 ")

	class Rat(x:Int, y:Int)
		{
			def numerator = x
			def denominator = y
		

			override def toString = numerator + "/" + denominator 	

			def +(entry: Rat):Rat =
			{
				new Rat(numerator + entry.numerator, denominator + entry.denominator)
			}//end + rat
			def -(entry: Rat):Rat =
			{
				new Rat(numerator - entry.numerator, denominator - entry.denominator)
			}//end - rat
			def *(entry: Rat):Rat =
			{
				new Rat(numerator * entry.numerator, denominator * entry.denominator)
			}//end * rat
			def /(entry: Rat):Rat =
			{
				new Rat(numerator / entry.numerator, denominator / entry.denominator)
			}//end / rat
		}//end rational class

	class Complex(x:Double, y:Double)
	{
		def R1 = x	
		def R2 = y	
		def I = 0.0


		override def toString = R1 + "+" + R2 + "i" 



		def +(entry: Complex):Complex =
		{
			new Complex(R1 + entry.R1, R2 + entry.R2)
		}//end + Complex
		def -(entry: Complex):Complex =
		{
			new Complex(R1 - entry.R1, R2 - entry.R2)
		}//end - Complex
		def *(entry: Complex):Complex =
		{
			new Complex(R1 * entry.R1, R2 * entry.R2)
		}//end * Complex
		def /(entry: Complex):Complex =
		{
			new Complex(R1 / entry.R1, R2 / entry.R2)
		}//end / Complex
		private def abosuluteValue(entry:Complex):Double =
		{ //according to the interweb this is how you get the absolute value of a complex number
			val squareR1 =  Math.pow(this.R1, 2)
			val squareR2 = 	Math.pow(this.R2, 2)
			val additon  = squareR1 + squareR2 
			val sqRoot = Math.sqrt(additon)
			sqRoot	
		}//end abosulute
		def squRoot(entry: Complex):Double=
		{
			val absolute = abosuluteValue(entry)
			val result = Math.sqrt(absolute) 
			result
		}
	

	}


	abstract class FancyNumbers()


	//random tests for complex

	val a = new Complex(1,2)
	val b = new Complex(3,4)

	val c = a.+(b)
	val d = a.squRoot(b)



	println(a.toString)
	println(c.toString)
	println("squ root of d  " + d)



	//random tests for Rat
	val A = new Rat(1,2)
	val B = new Rat(3,4)	

	val C = A.+(B)
	val D = A.-(B)
	val E = A.*(B)
	val F = A./(B)

	println("+ Rat: "+C.toString)
	println("- Rat: "+D.toString)
	println("* Rat: "+E.toString)
	println("/ Rat: "+F.toString)


	

	

}//end object lab 7
