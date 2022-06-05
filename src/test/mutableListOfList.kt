package test

fun main(){
    //创建可变的集合
    var list2 = mutableListOf<String>("Apple","banana","orange","pear")
    list2.add("西瓜")
    for (fruit in list2){
        println(fruit)
    }
//    可读不可变set集合
    var set = setOf<String>("a","b","f","c")
    for (s in set){
        print(s)
    }
//    可变可读set集合
    var set1 = mutableSetOf<String>("1","3","4","42")
    for (s1 in set1){
        println(s1)
    }
//    map集合
    var map = HashMap<String,Int>()
    map["a"] =1
    map["b"]=2
//    可变
    var map1 = mutableMapOf<String,Int>("11" to 1,"22" to 2,"112" to 3,"223" to 4)
//    不可变
    var map2 = mapOf<String,Int>("11" to 1,"22" to 2,"112" to 3,"223" to 4)
    for ((m1,m2) in map1){
        println("m1 is"+m1+"========="+"m2 is"+m2)
    }

}