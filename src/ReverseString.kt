import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    val str=scanner.next().toCharArray()


    for (i in str.size-1 downTo 0){
        print(str[i])
    }
}