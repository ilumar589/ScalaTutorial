/**
  * Created by eduardparvu on 20.11.2016.
  */

import scala.collection.mutable

class ChecksumAccumulator {
  /*
      Fields
   */
  private var sum: Int = 0

  /*
      Methods
   */
  def add(b: Byte): Unit = sum+=b
  def checksum(): Int = ~(sum + 0xFF) - 1
}

object ChecksumAccumulator {
  /*
      Fields
   */

  private var cache: mutable.Map[String, Int] = mutable.Map.empty

  /*
      Procedures
   */

  def calculate(letters: String): Int = {
    if (cache.contains(letters)){
      cache(letters)
    }else{
      val accumulator: ChecksumAccumulator = new ChecksumAccumulator
      for (letter <- letters) accumulator.add(letter.toByte)
      val checksum: Int = accumulator.checksum()
      cache += (letters -> checksum)

      /*
          Return
       */
      checksum
    }

  }
}
