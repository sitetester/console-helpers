import helper.table.Table

object TableTest extends App {

  val table = new Table()

  table.headers = List("ISBN", "Title", "Author")

  table.rows = List(
    List("isbn1", "title1", "author1"),
    List("isbn2", "title2", "author2"),
    List("isbn3", "title3", "author3")
  )

  table.tableSize = table.TABLE_SMALL
  table.render()

}
