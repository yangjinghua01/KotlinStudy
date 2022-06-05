package test

/**
 *  小母驴小公驴小公马生下来的儿子
 */
sealed class son {
    class 小小驴(): son()
    class 小骡子(): son()
    fun sayhello(){
        println("大家好")
    }
}

fun main() {
    var s1: son = son.小小驴()
    var s2: son = son.小骡子()
    var s3: son = son.小小驴()
    var list = mutableListOf<son>(s1,s2,s3)
    for (s in list){
        if (s is son.小骡子){
            s.sayhello()
        }
    }
}