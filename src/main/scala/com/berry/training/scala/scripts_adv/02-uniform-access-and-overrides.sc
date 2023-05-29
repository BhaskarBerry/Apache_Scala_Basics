import java.time.LocalDate

// Here by adding val to the parameter they become public so they are accible


abstract class Car(
  val make: String,
  val model: String,
  val year: Int
) {
  def isVintage: Boolean
}

val mustang = new Car("Ford", "Mustang", 1965) {
  def isVintage = LocalDate.now.getYear - year > 20
}

mustang.isVintage