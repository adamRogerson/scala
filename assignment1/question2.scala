object question2{
    def main(args: Array[String]) = println("Question 5 runnnning ")

    def g(x: Double) = x + 1
    def h(x: => Int) = g(x) * x - 1
    def f(x: => Double, y: => Int) = g(x) + h(y)


    val endResult = f(2.0 + 3.0, 2 * 2)


    //steps for 'x'
    // f sends x to g
    // g returns x + 1 to f 
    
    //steps for 'y' 
    // f sends y to h
    // h recasts y as x but i will still call it y
    // h sends y to g. 
    // g returns y + 1
    // h now mult the return by y - 1
   
    //steps of h/g in relation to the call from f
    // f calls g and asks it to return a double and thats all that g does
    // f calls h and asks it to reutn a double
    // h calls g and asks it to return a double and it does 
    // h then muls the returned value form g by 'y' and subtracs 1 
    // it finnaly reutns the double to f 

    println(endResult)



}//end object question 2
