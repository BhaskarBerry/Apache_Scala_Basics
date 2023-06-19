/*
Scala allows you to embed XML directly into a program and provides several ways to manipulate it.
*/

val xxml = <root>
<child>Text</child>
</root>

val data =  "This is sample data"


// You can embed logic and variables in the xxml by surrounding with {}
val xxml = <root>{data}</root>

val xml = <root>{for(i <- 1 to 3) yield <child>{i}</child>}</root>


// Save xml to file :
//scala.xml.XML.save("/tmp/doc.xml", xml)
XML.save("portfolio.xml", xxml, "UTF-8", true, null)