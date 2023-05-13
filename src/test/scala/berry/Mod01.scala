
package berry

import org.scalatest.Matchers
import berry.support.testSuite
import org.scalatest.SeveredStackTraces

class Mod01 extends testSuite with Matchers with SeveredStackTraces {

  test ("Something works") {
    1 should be (1)
  }
}
