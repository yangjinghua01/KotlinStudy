package jiami

import java.lang.StringBuilder
import javax.print.attribute.IntegerSyntax

/**
 * 凯撒加密算法
 */
class CaesarCrypt {

}

fun main() {
//    移动字符
    val char ='A' //->B
//    获取ascii
    var ascii = char.toInt()
    val key:Int = 2
//    移动
     ascii = ascii+key
    println(ascii.toChar())
    println("==============>")
    val pass:String = "I Love You"
    println("结果")
    println(jiami(pass,key))
    var jiamihou = jiami(pass,key)
    println("==============>")
    jiemi(jiamihou,key)
}

/**
 * 加密算法的方法
 */
fun jiami(password:String,key: Int):String{
    var strbuild = StringBuilder();
    var toCharArray = password.toCharArray()
    for (s in toCharArray){
       var res = s.toInt()+key
        strbuild.append(res.toString()+",")
    }
    return strbuild.toString()
}

/**
 * 解密的方法
 */
fun jiemi(caeapass:String,key: Int):String{
    var res = StringBuilder()
    var split = caeapass.split(",")
    var list = mutableListOf<String>()
    for (s in split){
        list.add(s)
    }
    list.removeAt(list.size-1)
    for (s in list){
        res.append((s.toInt()-key).toChar().toString())
    }
    println(res)
    return res.toString()
}
/**
 * 破解凯撒加密
 */
