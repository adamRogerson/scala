def adam = 2

System.out.println(adam)




def printAdd(x: => Int): Int = {
  System.out.println(x)

  x + 1
}


def x = 3+1
printAdd(x)



def avgFind(x:Int, y:Int ):Double ={

  (x+y)/2


}

avgFind(1,2)



def meaningOfLife(x: => Int):Int ={


 42

}



//def breakComp:Int = breakComp


//meaningOfLife(breakComp)

//def a =  (breakComp)

//wont complie "break comp only  calls its self


//term(9)


def numberRunner(x:Int): Int={

  println(x)

  if (x==1)
    x
  else
    numberRunner(term(x))


  def term(x:Int): Int={

    if (x%2 == 0 )
      x/2
    else
      (x*3) +1

  }//end term
1
}
//numberRunner(9)



def sum(x:Int): Int={

    def sumUp(x:Int, helper:Int ):Int={

        if (x == 0)
          helper
      else
        sumUp(x -1, helper + x)
    }
  sumUp(x,0)


}//end sum


sum(10)





