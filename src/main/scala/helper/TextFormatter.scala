package helper

object TextFormatter {

  def bold(text: String): Unit = {
    println(Console.BOLD + text)
  }

  def underline(text: String): Unit = {
    println(Console.UNDERLINED, text)
    reset()
  }

  def info(text: String): Unit = {
    println(Console.GREEN + text)
    reset()
  }

  def comment(text: String): Unit = {
    println(Console.YELLOW + text)
    reset()
  }

  def question(text: String): Unit = {
    println(Console.BLACK + Console.CYAN_B + text)
    reset()
  }

  def reset(): Unit = print("\u001b[0m")

  def error(text: String): Unit = {
    println(Console.RED_B + text)
    reset()
  }
}
