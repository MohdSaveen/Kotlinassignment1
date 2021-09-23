import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    val n=scanner.nextInt();
    val arr= arrayOfNulls<String>(n)
    for (i in arr.indices){
        arr[i]=scanner.next()
    }
    for (i in arr.size-1 downTo 0){
        println(arr[i])
    }
}