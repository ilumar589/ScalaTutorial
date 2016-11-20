/**
  * Created by eduardparvu on 20.11.2016.
  */
class Rational(n: Int, d: Int) {

  // # Preconditions #
  require(d != 0)

  // # Auxiliary constructors #
  def this(n: Int) = this(n,1)

  // # Fields #
  val numerator: Int = n
  val denominator: Int = d

  // # Methods #
  def add(that: Rational): Rational = {
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)
  }

  def less_than(that: Rational): Boolean = {
    (this.numerator * that.denominator) < (that.numerator * this.denominator)
  }

  override def toString = s"$numerator/$denominator"
}
