package ru.netology

import ru.netology.post.Post


fun main() {


    val new1 = WallService.add(
        Post(
            0,
            2226,
            2,
            10,
            12,
            "Hello!",
            2,
            2,
            false,
            12,
            "yes",
            12,
            13,
            "new",
            12,
            true,
            true,
            true,
            true,
            false,
            false,
            12,
            1
        )
    )


    val new2 = WallService.add(
        Post(
            0,
            2226,
            2,
            10,
            12,
            "Hello World!",
            2,
            2,
            false,
            12,
            "yes",
            12,
            13,
            "new",
            12,
            true,
            true,
            true,
            true,
            false,
            false,
            12,
            1
        )
    )

  val new5=WallService.update(Post(   3,
      2226,
      2,
      10,
      12,
      "Hello people!",
      2,
      2,
      false,
      12,
      "yes",
      12,
      13,
      "new",
      12,
      true,
      true,
      true,
      true,
      false,
      false,
      12,
      1
  ))
    println(new1)
    println(new2)
    println(new5)
}