/**
  * Created by eduardparvu on 20.11.2016.
  */

import ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]) {
    for (arg <- args) println(arg + ": " + calculate(arg))
  }
}
