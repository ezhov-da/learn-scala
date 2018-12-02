package ru.ezhov.learn.common.ch_2

//условные выражения
object p_21 extends App {
  val x = 2
  val y = if (x > 0) 1 else -1
  println(y + "/" + y.getClass.getName)
  //в Scala каждое выражение имеет тип
  println((if (2 > 5) 10).getClass.getName)
}
