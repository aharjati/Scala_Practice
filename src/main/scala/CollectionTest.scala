object CollectionTest {
  def main(args:Array[String]): Unit = {
    val a = Seq(1,2,3)
    val b = a.foldLeft(0)(_+_)
    println("foldLeft: " +  b )

    def f(x:Int)= if(x>1) Some(x) else None
    val c = a.flatMap(f(_))
    println("map  flatMap: " +  c.mkString(","))
  }
}
