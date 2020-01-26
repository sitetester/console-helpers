package helper.question

object Question extends App {

  def confirm(question: String): Boolean = {

    println(question)
    scala.io.StdIn.readBoolean()
  }

  def ask(question: String): String = {

    println(question)
    val answer = scala.io.StdIn.readLine()
    if (answer.trim.length == 0) {
      ask(question)
    }

    answer
  }

  def multiChoice(question: String, options: List[String]): List[Int] = {

    println(question)
    options.zipWithIndex.foreach(opt =>
      println(opt._2 + ". " + opt._1.toLowerCase))

    println("Hint: Enter multiple values with comma (,).")
    val answer = scala.io.StdIn.readLine()

    var intAnswers: List[Int] = List()
    if (answer.contains(",")) {
      intAnswers = answer.split(",").map(_.trim.toInt).toList
    } else {
      intAnswers = List(answer.toInt)
    }

    intAnswers = intAnswers.distinct

    val allValid = intAnswers.forall(ans => options.indices.contains(ans))
    if (!allValid) {
      intAnswers = multiChoice(question, options)
    }

    intAnswers
  }
}
