package set01


fun main() {
    //1.1.1
    //swap(1, 2)
    //swap(10, 6)

    println("")

    //1.1.2
    //swap_inplace(1, 2)
    //swap_inplace(10, 6)

    //1.1.3
    //pow(2, 0)
    //pow(2, 2)
    //pow(2, 3)
    //pow(3, 2)
}

fun swap(v1: Int, v2: Int) { //1.1.1
    var a = v1
    var b = v2
    print("Basic swap: Input $a, $b  ->  ")

    val t = a
    a = b
    b = t

    println("Output $a, $b")
}

fun swap_inplace(v1: Int, v2: Int) { //1.1.2
    var a = v1
    var b = v2
    print("In-place swap: Input $a, $b  ->  ")

    a = a + b
    b = a - b
    a = a - b

    println("Output $a, $b")
}

fun pow(num: Int, pow: Int) { //1.1.3
    var result = 1
    for(i in 1..pow) {
        result *= num
    }

    println("pow($num, $pow) = $result")
}