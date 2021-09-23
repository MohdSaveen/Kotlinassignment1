import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    val year=scanner.nextInt()
    var leap=false

    if (year %4==0){
        if (year %100==0){
            leap=year%400==0
        }else{
            leap=true
        }
    }else{
        leap=false
    }
    if (leap){
        println("Leap Year")
    }else{
        println("Not Leap Year")
    }
}