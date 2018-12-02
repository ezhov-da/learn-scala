package ru.ezhov.learn.common.ch_2

//расширенные циклы for и for-генераторы
object p_26 extends App {
  for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
  println()
  for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
  println()
  val v = for (i <- 1 to 10) yield i % 3
  println(v)
}
