//类和对象的使用测试类
fun main(){
    var person = Person("tom", 12);
    person.age=1;
    person.name = "tom";
    person.eat();
    var student = Student("jack", 19);
//    eat 方法来自父类
    student.eat();
    student.readBook();
    student.doHomeWork();
//    创建集合
    val list = ArrayList<String>();
    list.add("Apple")
    list.add("banana")
    list.add("orange")
    list.add("pear")
    list.add("grape")
//    下面创建的集合是不可变的集合
    var list1 = listOf<String>("Apple","banana","orange","pear")
    for(fruit in list1 ){
        println(fruit)
    }
    for (shuiguo in list){
        println(shuiguo)
    }
}