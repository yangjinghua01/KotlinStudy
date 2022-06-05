package jiami

import java.lang.StringBuilder

class AsciiDemo {
}
/**
 * 获取字符的ascii码
 */
fun main() {
//    字符ascii
    var c:Char = 'a'
    var value:Int = c.toInt()
    println(value)
//    获取字符串的ascii
    var str:String = "I Love You"
//    便利获取每一个字符的ascii
    var stringbuild = StringBuilder()
    val tochartarray=str.toCharArray();
    for (s in tochartarray){
        var toInt = s.toInt()
        stringbuild.append(toInt.toString()+",")
    }
    println(stringbuild)
}