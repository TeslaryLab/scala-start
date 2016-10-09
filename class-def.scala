// simple class
class Person(firstName: String, lastName: String)
val gump = new Person("Tom", "brew")

class Compass {

	val directions = List("north", "east", "south", "west")
	var bearing = 0

	println("Initial bearing: ")
	println(direction)

	def direction() = directions(bearing)

	def inform(turnDirection: String) {
		println("Turning " + turnDirection + ". Now bearing " + direction)
	}

	def turnRight() {
		bearing = (bearing + 1) % directions.size
		inform("right")
	}

	def turnLeft() {
		bearing = (bearing + (directions.size - 1)) % directions.size
		inform("left")
	}
}

val myCompass = new Compass
myCompass.turnLeft
myCompass.turnRight

// 辅助构造器
class Person(firstName: String) {
	println("Outer comstructor")
	def this(firstName: String, lastName: String) {
		this(firstName)
		println("Inner comstructor")
	}
	def talk() = println("Hi")
}

val bob = new Person("Bob")
val bobTate = new Person("Bob", "Tate")

// 当一个类只能拥有一个实例的时候, 使用object修饰
object TrueRing {
	def rule = println("To rule them all")
}
TrueRing.rule

// 继承
class Person(val name: String) {
	def talk(message: String) = println(name + " says " + message)
	def id(): String = name
}

class Employee(override val name: String,
						val number: Int) extends Person(name) {
	override def talk(message: String){
		println(name + " with number " + numbeer + " says " + message)		
	}
	override def id(): String = number.toString
}

val employee = new Employee("Yoda", 4)
employee.talk("Extend or extend not. There is no try")


// trait 完成 mixin
class Person(val name: String)

trait Nice {
	def greet() = println("How do you do.")
}

class Character(override val name:String) extends Person(name) with Nice

val flanders = new Character("Ned")
flanders.greet

// case class