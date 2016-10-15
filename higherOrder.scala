object higherOrder{

  def main(args: Array[String]) = println("Higher Order problems -----------------------")


  def higher(f:Double=>Double,a:Double) :Double =
  {
    (f(a)*2)-1
  }//end higher

  def PowerFactory():(Double,Double) => Double =
  {
    (x:Double,y:Double) => Math.pow(x,y)

  }//end power Factory
  
  //to ask "in Q 12 we are asked to make the input flexable how can we do that ?" 
  def greaterThan(n:Double):(Double)=> Boolean =
  {
      x => if(x>n) true else false
  
  }//end great than

  def curryPower(x:Double)(y:Double):Double=
  {

    Math.pow(x,y)

  }//end curry power




  //tests===============================================================================
  def powerFactoryTest():Double =
  {
    //gets the powerFactory function as a val
    val a = PowerFactory();

    //uses the powerFactory 
    val b = a(2,4)

    //results
    b
    
  }

  def greaterThanTest() =
  {
    val a = greaterThan(5)
    val b = a(6)
    println("result from greate than = " + b)
    

  }//end greaterThan test

  def curryPowerTest() =
  {
    //a becomes a yeileded half called version of curry power
    val a = curryPower(2)_
    println("result of curry power "+a)

    //here we make a new value b and it is the result of the finisehd method curry power
    val b = a(3)
    println("result of curry power "+b)
  }

    powerFactoryTest()
    greaterThanTest()
    curryPowerTest()
}
