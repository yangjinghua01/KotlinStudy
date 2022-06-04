class diguidemo {
}
/**
 * 递归的demo
 * 阶乘
 */
fun fact(num:Int):Int{
    if (num == 1){
        return 1
    }else{
        return  num*fact(num-1)
    }
}
//尾递归优化
fun olladd(num: Int):Int{
    if (num ==1){
        return 1;
    }else{
        return num +olladd(num-1)
    }
}


//循环
fun add(num: Int){
    var resule:Int =0
    for (i in 0..num){
        resule= resule+i
    }
    println(resule);
}
fun main() {
    add(3)
}