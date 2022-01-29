val s = "Berry"

s.length

s(1)
s(0)

s.r

s.drop(1)

s.take(1)

val longString =
  """
    |First Line
    |Second Line
    |Third Line
    |""".stripMargin

longString.lines

longString.lines.toList

longString.lines.map(_.length())

