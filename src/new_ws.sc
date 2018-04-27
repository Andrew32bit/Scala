for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar//генератор
for ( c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
for (i <- 1 to 5) yield i%3

//for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar








def abs(x: Double) = if (x >= 0) x else -x; abs(-2.3921123123)
def abs2(x: Double): String = {
  if (x >= 0) {
    x
  } else {
    -x
  }
  abs(-2.3921123123)+"mama"
}


def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1);fac(-1);fac(4)
("Hello, " + "Scala!")
16.toHexString


def decorate(str: String, left: String = "[", right: String = "]") = left + str + right+right +left

decorate("HELLO My BITCH ")


//Third day
def recursiveSum(args: Int*) : Int = {
  if (args.length == 0) 0
  else args.head + recursiveSum(args.tail : _*)
}

val f=recursiveSum(5,4,3,2,1)
println(f)

//Procedures
def box(s : String) { // Смотрите внимательнее: здесь нет =
  val border = "­" * (s.length + 2) ; print(f"$border%n|$s|%n$border%n")
}
val s1="hello"
println(box(s1))
//lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString//lazy call out-it will not been excuted while you call it
//Exceptions
//throw new IllegalArgumentException("x should not be negative")

val x = 4

import scala.math
def sq(n:Double):Double= { if (x >= 0)  scala.math.sqrt(x)
else throw new IllegalArgumentException("x should not be negative") }
val b1= sq(-4)
println(b1)

