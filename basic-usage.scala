def forLoop {
	println("loop using Java-style")
	for(i <- 0 until args.length) {
		println(args(i))
	}
}

def rubyForLoop {
	println("for loop using Ruby-style")
	args.foreach{ arg =>
		println(args)
	}
	// args.each{|arg| println(arg)}
}

// list
val range = 0 until 10
range.start
range.end

(10 until 0) by -1
(0 to 10) by 5

val person = ("Tom", "Susan")
person._1 // == "Tom"

// tuple
val (x, y) = (1, 2)  

// function
def double(x:Int):Int = x * x
double(2)

// 数据结构
// List
List("one", 2, "3")

// Set
val animals = Set("lion", "tigers", "bears")

// Map
val ordinals = Map(200 -> "Sccuess", 400 -> "Not found")

// 指定类型的Map
import scala.clooection.mutable.HashMap
val map = new HashMap[Int, String]
map += 502 -> "Server error"

// 特殊类型
"""
所有的类都继承与 Any
Nothing 是所有类的子类
"""