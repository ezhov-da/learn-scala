package ru.ezhov.learn.common.ch_2

//циклы
object p_25 extends App {
  val n = 5
  for (i <- 1 to n) {
    println("-> " + i)
  }

  for (i <- 0 until 5) {
    println("-> " + i)
  }

  for (c <- "Hello") println(c)
}
