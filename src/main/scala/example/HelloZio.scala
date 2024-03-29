package example

import zio.App
import zio.console._

object HelloZio extends App {

  def run(args: List[String]) =
    program.fold(_ => 1, _ => 0)

  val program =
    for {
      _ <- putStrLn("Hello! Welcome to Zio!")
    } yield ()

}
