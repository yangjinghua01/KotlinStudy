package test

/**
 * 这里注意默认kotlin是不支持继承的。必须加上open才能被继承
 */
open class Person(var name:String,var age:Int) {
    fun eat() {
        println("name" + name + "is eating" + "age" + age)
    }
}