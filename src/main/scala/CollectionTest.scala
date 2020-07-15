object CollectionTest {

  // curry test
  def curry = (a:Int) => a*2

  def main(args:Array[String]): Unit = {
    val a = Seq(1,2,3)
    val b = a.foldLeft(0)(_+_)
    println("foldLeft: " +  b )

    println("filtering using function and flatmap")
    def f(x:Int)= if(x>1) Some(x) else None
    val c = a.flatMap(f(_))
    println("result: " +  c.mkString(","))

    println("filtering using filter")
    println("result: "+ a.filter(v => v>1).mkString(","))

    println("currying")
    println("result with param 2 :"+ curry(2))

    val d = curry
    println("result after defining val with curry(without any param) :"+ d(2))


    println("Multiple Generators")
    val a1 = Seq(1,2,3)
    val a2 = Seq('a','b','c')
    val a3 = Seq(4,5,6)

    val res = for {
      b1 <- a1
      b2 <- a2
      b3 <- a3
    } yield (b1,b2,b3)

    println("result : "+res.mkString(","))
  }
}
