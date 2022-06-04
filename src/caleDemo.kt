class caleDemo {
}

/**
 * kotlin的异常捕获
 */
fun main() {
    println("请输入第一个数字：")
    var num1str = readLine()
    println("请输入第二个数字：")
    var num2str = readLine()
//    和java一致捕获可能会出现错误的地方
    try {
        var num1:Int = num1str!!.toInt()
        var num2:Int = num2str!!.toInt()
        println("${num1}+${num2}=${num1+num2}")
    }catch (e:Exception){
        println(e)
    }


}