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
NULL是一个trait, null是NULL的实例
空集合是nil
Nothing是一个trait
Nothing没有实例, 不能解引用
抛出异常用Nothing, 相当于根本没有返回值
"""

val list = List("fordo", "samwise", "pippin")
list.foreach(hobbit => println(hobbit))

val hobbits = Map("frodo" -> "hobbit", 
				  "samwise" -> "hobbit",
				  "pippin" -> "hobbit")

hobbits.foreach(hobbit => println(hobbit._1))
hobbits.foreach(hobbit => println(hobbit._2))

list.head
list.last
list.tail
list.init
list.reverse
list.drop(1)

val words = List("peg", "al", "bud", "kissy")
words.count(word => word.size > 2) # 计数
words.filter(word => word.size > 2) # 过滤
words.map(word => word.size)
words.forall(word => word.size > 1)
words.exist(words => words.size > 4)
words.exist(words => words.size > 5)
words.sort((s,t) => s.charAt(0).toLowerCase < t.charAt(0).toLowerCase)
words.sort((s,t) => s.size < t.size)

// foldLeft
val list = List(1,2,3)
val sum = (0 /: list) {(sum, i) => sum + i}
list.foldLeft(0)((sum, value) => sum + value)
