import scala.collection.mutable
import scala.math._

object TreasureHunt extends App{


	val treasureMap = mutable.Map[Int, String]()
	treasureMap += ( 1 -> "Go to island")
	treasureMap += ( 2 -> "Find the X")
	treasureMap += ( 3 -> "Dig")

	//pg 524, Map operations
	//getOrElse return key or 2nd value
	println(treasureMap.getOrElse(5, "No where to dig!")) 

	var iterator = treasureMap.keysIterator
	
	//messing with functional
	iterator.foreach(iterator  => println(iterator))

	val filename = args(0)
	println(filename)	
	if(filename == "matt")
	println("matts good at scala")	
}

