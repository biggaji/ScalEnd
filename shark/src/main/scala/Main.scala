/**
  * Scala supports Type too
  */
type Str = String

@main def hello: Unit =
  // Arrays 
  val names = Array("Tobiloba", "Anderson")

  // println(names(0))
  names(1) = "Dolapo"

  names.foreach(println)

  // function

  val anon = (x: Int) => { 3*x };

  // method
  def checkData(): Unit = {
    println("Data")
  }

  def mutlipleAndSumAndSubtract(num1: Int, num2: Int)(sum: Int)(subtractor: Int): Int = 
    ((num1 * num2) + sum) - subtractor

  println(anon(3))
  println(mutlipleAndSumAndSubtract(2,4)(2)(5))
  println(System.getProperty("user.name"))

  // Classes
  class Gretter(prefix: String):
    def init(name: String): Unit = 
      val fullFormattedText = s"Hello ${prefix} ${name}!"
      println(fullFormattedText)

  
  val greeter = Gretter("master");
  greeter.init("Tobi")


  // Objects
  object Human:
    private var counter = 0;
    def inc: Int = {
      counter +=1
      counter
    }
  
  val id = Human.inc;
  val id1 = Human.inc;

  println(id)
  println(id1)

  // Traits

  trait Greet:
    def init(name: Str): Unit =
      println(s"Hey! ${name}")


  class Grim(postfix: String) extends Greet:
    override def init(name: Str): Unit =
      println(s"Hello ${postfix} ${name}")

  val grim = Grim("master")
  println(grim.init("Tobi"))

  class Gey extends Greet

  val gey = Gey();
  gey.init("Shola")

  class Humanity(firstname: Str, lastname: Str):
    private var _fullname: String = "";
    override def toString(): String = s"$firstname $lastname"

    def setFullName_(newName: Str): Unit =
      _fullname = newName;

    def getDefaultFullName_ : Str =
      _fullname = s"$firstname $lastname"
      _fullname

    def getFullName_ : Str =
      _fullname  
  end Humanity

  val human = Humanity("Tobiloba", "Ajibade");
  println(human.toString())
  println(human.setFullName_("Tobi Ajibade"))
  println(human.getFullName_)
  println(human.getDefaultFullName_)



//   println("Hello world!")
//   println(msg)
//   println(defaultStartTime)
//   println(GreetUser("Tobiloba"))
//   println(SumInts(2,8))
//   println(isEvenNumber(34))

//   def format(fn: (num: Int) => Str ) = {
//     var remainingAvailableSeatCount = 5;
  
//     while (remainingAvailableSeatCount >= 0) {
//       println(fn(remainingAvailableSeatCount));
//       remainingAvailableSeatCount -= 1;
//     }
//   }

//   try  print(1 / 0)
//   catch {
//     case e: ArithmeticException =>
//       println(Console.RED + e.getMessage() + Console.RED)
//   }

//   format(styleInt) //Using function Signature

// def msg = "I was compiled by Scala 3 by Tobi. :)"
// Variables 
// val, var, def, lazy val, type
// const, let, function, lazy is the mixture of val and def
// {} is used for scopes



// val defaultStartTime = {
//   // println("The last value in between the curly brases will be assigned to the variable")
//   var startTime: Int = 10;
//   val defaultInitialStartTime = 10;
//   var userPrefferedStartTime = 200;

//   // if (userPrefferedStartTime != null) 
//   //   startTime = userPrefferedStartTime
//   // else
//   //   startTime = defaultInitialStartTime
//   //   startTime
// };

// def isEvenNumber(num: Int): Boolean = {
//   val remainder = num % 2;
//   var isEven = false;

//   if (remainder == 0) {
//     isEven = true;
//   }

//   isEven;
// }

// def GreetUser(name: Str): Unit = {
//   val greetingTextWithName = s"Hey $name" // or if it an expression ${name}
//   println(Console.RED + greetingTextWithName + Console.RED)
// }

// def SumInts(int1: Int, int2: Int): Int = {
//   int1.+(int2);
// }


// def styleInt(num: Int): String =  {
//   Console.GREEN + num + Console.GREEN
// }

// case is used for pattern matching

// def StoreUserName(name: Str) : Str = {
//   try  print(1 / 0)
//   catch {
//     case e: ArithmeticException =>
//       println(Console.RED + e + Console.RED)
//   }
// }