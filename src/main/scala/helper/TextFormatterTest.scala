package helper

object TextFormatterTest extends App {

  TextFormatter.bold("bold text")
  TextFormatter.underline("underlined text")

  TextFormatter.info("This should be printed in `GREEN` color")

  TextFormatter.comment("This should be printed in `YELLOW` color")

  TextFormatter.question(
    "This should be printed with BLACK text on a cyan background")

  TextFormatter.error(
    "This should be printed with WHITE text on a RED background")

  println("Clickable link example  - <a href=\"http:www.yahoo.com\">Yahoo</a")

}
