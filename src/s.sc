//First day
object test {
  println("hello Andrew")
  val x = 2
  x*3
  ("My answer is " + x).toLowerCase
  ("My answer is " + x).toUpperCase
  x.toString() // Вернет строку "1"

}

1.to(10) // Вернет Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
1 to 10

val x:BigInt = 12312093

print("this is my shit "+ x*x*x)

"Bonjour".sorted // Вернет строку "Bjnooru"

val stroka=("Hello".intersect("World")).sorted
val bol_stroka="jaksdkasjdlkjasdjk"
val bukva=bol_stroka(5)
println (bukva)

import scala.math._
import scala.util.Random
sqrt(2)

BigInt("1234567890") * BigInt("112358111321")

"Bierstube".containsSlice('r'.to('u'))
//Second day
val z= 3
val sqr_z=sqrt(z)
val qv_z=pow(sqr_z,2)
println(qv_z-sqr_z)

BigInt(2) pow 1024

import BigInt.probablePrime
import util.Random


probablePrime(100, Random)

val a = 3 ;
val f = if (a < 0)  3 else if (a == 0) 2 else 4 ; println(f)

val g = {val g1=1; val g2=2 ; sqrt(g1*g2*a)}

val name = "Andrew"
val age =32

printf("Hello, %s! You are %d years old.\n", name, age)
print(f"Hello, $name! In six months, you'll be ${age + 0.5}%1.2f years old.%n")
//print (f"Hello,$name!In one year,you will be ${age + 1}%1.2f years old.%/n")

//Ciclyes
val n =10
val r =2

for( a <- r to n) {
  println( "Value of a: " + a )

}


val s = "Hello"
var sum = 0

for (i <- 0 to s.length - 1){
}
//third day
for (i <- 1 to 5) yield i%3 //генератор
for (i <- 1 to 10) yield i%3