package test

import java.lang.Math.max

/**
 * kotlin 入门经典 hello world
  */
fun main(){
        print("Hello World" )
}
/**
 * 变量
 * val 用来声明一个不可变的变量这种变量在初始复制之后就在也不能重新复制。对应java中的final
 * var 用来声明一个可变的变量这种变量在初始化赋值之后仍然可以在被重新赋值
 */
fun main1(){
    val a = 10;
    print("a="+a);
}
/**
 * kotlin 的类型推导不能正常工作的时候需要显示的声明变量才可以
 */
fun main2(){
    var  a : Int = 10;
    a = a*10;
    print(a);
}
/**
 * kotlin 的函数实际上函数和方法是同一种东西
 */
fun methodName(param1:Int,param2: Int):Int{
    return 0;
}
/**
 * 对应java来理解上面的东西
 * public int test.test.methodName(int param1,int param2){
 *return 0;
 *}
 * fun 是定义函数的关键字 fun 后面跟的是函数名 函数名后面的括号里是参数 上面的函数接受两个int 类型的参数 在后面：Int 是函数的返回值
 */
fun largerNumber(num :Int, num1: Int):Int{
    return  max(num,num1);
}
//简化
fun largerNumber1(num: Int,num1: Int)= max(num,num1);
/**
 * 逻辑控制
 */
fun larger(num1: Int,num: Int):Int{
    var value = 0
    if (num1>num){
        value =num1
    }else{
        value = num
    }
    return value;
}
//简化
fun large(num1: Int,num: Int)= if (num1>num) num else num1
//when
fun getScore(name:String)=when(name){
    "Tom"->86
    "jin"-> 77
    else ->0
}
//类型匹配
fun checkNumber(num1: Number){
    when(num1){
        is Int -> print("number is Int")
        is Double -> print("number is Double")
        is Long -> print("number is Long")
        else -> print("number not supper")
    }
}
//when 的高拓展用法
fun usewhen(name: String)= when{
    name == "tom" -> print(name)
    name == "jin" -> print(name)
    else -> print("null")
}
//kotlin 循环
fun xunhuan(){
    for (i in 0..10){
        println(i)
    }
}
fun xunhuan1(){
    for (i in 0 until 10 step 3){
        println(i)
    }
}
fun xunhuan2(){
    for (i in 10 downTo 1){
        println(i)
    }
}