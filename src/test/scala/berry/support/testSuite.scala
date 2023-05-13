package berry.support

import org.scalatest.Reporter
import org.scalatest.Stopper
import org.scalatest.Distributor
import org.scalatest.Filter
import org.scalatest.Tracker
import org.scalatest.FunSuite
import org.scalatest.events.Event
import org.scalatest.events.TestSucceeded
import org.scalatest.Args
import scala.collection.mutable.ListBuffer
import org.scalatest.Status
import org.scalatest.CompositeStatus


abstract class testSuite extends FunSuite with StopOnFirstFailure {
  def koan(name : String)(fun: => Unit) = test(name)(fun)
}

