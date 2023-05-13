package berry.support

object BlankValues {
    class ReplaceWithCorrectException extends Exception

    val str = "Should be filled in"
    class Mod1 extends ReplaceWithCorrectException {
        override def toString() = "str"
    }
}

