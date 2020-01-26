import helper.question.Question

object QuestionTest extends App {

  // askTest()

  def confirmTest(): Unit = {

    val answer = Question.confirm("Continue ? (y/n)")
    if (answer) {
      println("You confirmed!")
    } else {
      println("You ignored!")
    }
  }

  def askTest(): Unit = {
    val answer = Question.ask("What's yr name ?")
    println("You replied: " + answer)
  }

  def multiChoiceTest(): Unit = {
    val answer: List[Int] =
      Question.multiChoice("Your favourite color(s)?",
                           List("BROWN", "WHITE", "BLUE"))

    println("You replied with answer(s):" + answer.mkString(","))
  }

}
