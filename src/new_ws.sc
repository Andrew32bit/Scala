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


def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

decorate("HELLO My BITCH ")


