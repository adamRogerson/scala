object question1
{

    def main(args: Array[String]) = println("End Assingment2 Q:1")




    abstract class Shape(colour:String)
    {

        override def toString():String=
        {
            //gets the name / color of the object forces to correct case and grabs first letter as a char
            val name = this.getClass.getSimpleName.toUpperCase.head
            val color = this.colour.toLowerCase.head

            return name + "("+ color + ")"
        }


        if (colour != "Red")
        {//this is just a proff of concept
            //println("error in color def")
        }
    }



        case class Square(sideLength:Double, colour:String) extends Shape(colour)
        {

        }

        case class Triangle(baseLength:Double, height:Double,colour:String) extends Shape(colour)
        {
        }


        case class Circle(radius:Double,colour:String) extends Shape(colour)
        {
        }


    //class picture must always be given 1 row the other two are optional
    class Picture(row1:List[Shape], row2:List[Shape] =null, row3:List[Shape] =null)
    {

        def printAll()=
        {//This class is entirely writen to make the stuff look nice
          if(this.row1 != null)
          {
              print("|")
              for (shape <- this.row1){print(shape+ "|")}
              println("")
          }

          if(this.row2 != null)
          {
              print("|")
              for (shape <- this.row2){print(shape+ "|")}
              println("")
          }

          if(this.row3 != null)
          {
              print("|")
              for (shape <- this.row3){print(shape+ "|")}
              println("")
          }

        }//end print all

        def addShape(newShape:Shape, row:Int): Picture =
        {//due to the list being immutibe add will create a new row list and replace the old one
          if(row == 1)
          {
              val newRow = this.row1:+ newShape
              return new Picture(newRow ,this.row2,this.row3)
          }

          if(row == 2)
          {
              val newRow = this.row2:+ newShape
              return new Picture(this.row1,newRow,this.row3)
          }

          if(row == 3)
          {
              val newRow = this.row3:+ newShape
              return new Picture(this.row1,this.row2,newRow)
          }

          //if row was not 1,2,3 it will just return its self un changed
          return this
        }
    }





    val mySqu = Square(10,"green")
    val mySqu2 = Square(5,"Green")

    val myTri = Triangle(5,3,"Blue")
    val myTri2 = Triangle(5,3,"Green")

    val myCir = Circle(5,"Red")
    val myCir2 = Circle(8,"Blue")
    val myCir3 = Circle(1,"Green")


    val testRow1 = List(mySqu,myTri)
    val testRow2 = List(myCir,myTri2,myCir2)
    val testRow3 = List(mySqu2,myTri2,myCir3)


    val myPicture = new Picture(testRow1,testRow2,testRow3)

    //val updatedMyPicture = myPicture.addShape(myTri,1)
    myPicture.printAll()



}
