package test

class whendemo {

}
//when条件选择语句相当于java中的swich语句
fun gredel(gre:Int){
    when(gre){
        10->println("man")
        9-> println("weiman")
        8-> println("haikey")
        7-> println("haixunuli")
        6-> println("ganghaojige")
        else-> println("xuyaonuli")
    }
}
fun test(){
//    定义一个1到100的数组
    var nums = 1..100;
    for (num in nums){
        println(num)
    }
}
fun inttostring(num:Int){
    println(num.toString())
}
fun stringtoint(str:String){
    println(str.toInt())
}
fun test1(){
//    相当于【1，100）左臂右开区间
    var nums = 1 until 100
    for (n in nums){
        println(n)
    }
}



fun main() {
    gredel(3)
    test()
}