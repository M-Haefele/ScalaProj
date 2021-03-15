import scala.io.Source


object readFromSource{
	def main(args: Array[String]): Unit = {
		var lines = Source.fromFile(args(0)).getLines()
		if (args.length > 0){
			for (line <- lines )
				println(line.length.toString + " " + line)
			}
		else
			Console.err.println("Please enter filename")

		var maxWidth = 0
		var names  = Source.fromFile(args(0)).getLines()
		for (line <- names){
			println("Line.length is"+ line.length())
			if(line.length() > maxWidth)
				maxWidth = line.length()
				println("max lengh is" + maxWidth)		
		}	
	}
	
}	
