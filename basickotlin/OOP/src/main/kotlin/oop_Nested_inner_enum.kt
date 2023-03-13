fun main(args: Array<String>) {
    ong().cha().ham()
    ong().hambo()
    println("-----------------")
    //name
    println(bangPhai.aoThuat.name)
    println(bangPhai.nhanThuat.name)
    println(bangPhai.theThuat.name)
    //vi tri
    println(bangPhai.aoThuat.ordinal)
    println(bangPhai.nhanThuat.ordinal)
    println(bangPhai.theThuat.ordinal)
    //ten class
    println(bangPhai.theThuat.declaringClass)
    //when trong enum
    var a =bangPhai.theThuat
    when(a){
        bangPhai.theThuat -> println("Ban thuoc ban phai the thuat")
        bangPhai.nhanThuat -> println("Ban thuoc ban phai nhan thuat")
        bangPhai.aoThuat -> println("Ban thuoc ban phai ao thuat")
    }
    println("duyet mang")
    var ds =bangPhai.values()
    ds.forEach {
        println(it)
    }
}