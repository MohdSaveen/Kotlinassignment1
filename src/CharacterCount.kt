import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    val str=scanner.nextLine().replace(" ","")
    var count=0
    for (i in str.indices){
        count++
    }
    print(count)
}