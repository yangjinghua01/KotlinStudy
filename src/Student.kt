class Student(name:String, age:Int): Person(name,age), Students {
    override fun readBook() {
        println(name+"read"+age)
    }

    override fun doHomeWork() {
        println(name+"dohomeword"+age)
    }
}