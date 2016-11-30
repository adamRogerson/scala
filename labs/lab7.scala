object lab7
{
    def main(args: Array[String]) = println("end lab7 ")



    abstract class FancyNumber()
    {

      def val1:Double
      def val2:Double


        def toString(val1:Double, val2:Double):String =
        {
            val x = val1.toString
            val y = val2.toString
            val result = (x + ":" + y)
            result
        }

        //def add(fn:FancyNumber): Double e match{

          //case Rat()=>
          //case Complex()=>
        //}


    }//end Fancy Numbers


    case class Rat(num:Double, dec:Double) extends FancyNumber()
    {

      def val1 =  num
      def val2 =  dec

      override def toString():String =
      {
        super.toString(val1,val2)
      }


    }//end rational class

    //class Complex(val1:Double, val2:Double) extends FancyNumber(val1:Double, val2:Double)
    //{
    //    //def val1 = x
    //    //def val2 = y

    //    def I = 0.0

    //    override def toString():String =
    //    {
    //      super.toString(val1,val2)
    //    }

    //    def +(entry: Complex):Complex =
    //    {
    //        new Complex(val1 + entry.val1, val2 + entry.val2)
    //    }//end + Complex

    //    def -(entry: Complex):Complex =
    //    {
    //        new Complex(val1 - entry.val1, val2 - entry.val2)
    //    }//end - Complex

    //    def *(entry: Complex):Complex =
    //    {
    //        new Complex(val1 * entry.val1, val2 * entry.val2)
    //    }//end * Complex

    //    def /(entry: Complex):Complex =
    //    {
    //        new Complex(val1 / entry.val1, val2 / entry.val2)
    //    }//end / Complex



    //    private def abosuluteValue(entry:Complex):Double =
    //    {//pulled this math from S/O

    //        val squareval1 =  Math.pow(this.val1, 2)
    //        val squareval2 =  Math.pow(this.val2, 2)
    //        val additon  =  squareval1 + squareval2
    //        val sqRoot   =  Math.sqrt(additon)
    //        sqRoot

    //    }//end abosulute

    //    def squRoot(entry: Complex):Double=
    //    {
    //        val absolute = abosuluteValue(entry)
    //        val result = Math.sqrt(absolute)
    //        result
    //    }


    //}//end complex class



    val Adam = new Rat(1,2)

    println(Adam.toString)


	//random tests for complex

	//val a = new Complex(1,2)
	//val b = new Complex(3,4)

	//val c = a.+(b)
	//val d = a.squRoot(b)



	//println(a.toString)
	//println(c.toString)
	//println("squ root of d  " + d)



	////random tests for Rat
	//val A = new Rat(1,2)
	//val B = new Rat(3,4)

	//val C = A.+(B)
	//val D = A.-(B)
	//val E = A.*(B)
	//val F = A./(B)

	//println("+ Rat: "+C.toString)
	//println("- Rat: "+D.toString)
	//println("* Rat: "+E.toString)
	//println("/ Rat: "+F.toString)






}//end object lab 7
