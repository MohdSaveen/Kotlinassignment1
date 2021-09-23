import java.util.*

fun main(){

    val scanner= Scanner(System.`in`)
    val n=scanner.nextInt()
    val arr= arrayOfNulls<Int>(n)
    for(i in 0 until n){
        arr[i]=scanner.nextInt()
    }

    for (i in 0 until n){
        var count=0
        for (j in 0 until n){
            if(i==j){
                continue
            }
            if (arr[i]==arr[j]){
                count++

            }
        }
        if(count>0){
            println(arr[i])
        }
    }
}