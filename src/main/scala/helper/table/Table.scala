package helper.table

class Table {

  val TABLE_LARGE = 50
  val TABLE_SMALL = 25

  private val _borderStyle = "-"
  private var _tableSize = TABLE_SMALL
  private var _headers: List[String] = List()
  private var _rows: List[List[String]] = List()

  def headers: List[String] = _headers

  def headers_=(headers: List[String]): Unit = {
    _headers = headers
  }

  def rows: List[List[String]] = _rows

  def rows_=(rows: List[List[String]]): Unit = {
    _rows = rows
  }

  def tableSize: Int = _tableSize

  def tableSize_=(tableSize: Int): Unit = {
    _tableSize = tableSize
  }

  def render(): Unit = {
    var render = ""
    render += renderHeaders()
    render += renderRows()

    println(render)
  }

  def renderRows(): String = {
    var render = ""

    for (row <- _rows) {
      for (cell <- row) {
        render += "| " + cell + " " * (_tableSize - cell.length - 1)
      }

      render += "|"
      render += "\n"
    }

    render += headerSurroundingRow()
    render
  }

  def renderHeaders(): String = {
    var render = ""

    render += headerSurroundingRow()
    render += "\n"

    for (h <- _headers) {
      render += "| " + h + " " * (_tableSize - h.length - 1)
    }

    render += "|"
    render += "\n"

    render += headerSurroundingRow()
    render += "\n"

    render
  }

  def headerSurroundingRow(): String = {
    var render = ""

    for (_ <- _headers) {
      render += "+" + _borderStyle * _tableSize
    }

    render += "+"
    render
  }
}
