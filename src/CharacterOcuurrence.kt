import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    val str=scanner.nextLine().replace(" ","").lowercase()
    val arr=str.toCharArray()
    for (i in arr.indices){
        var count=1
        var ch='a';
        for (j in arr.indices){
            if(i==j){
                continue
            }
            if (arr[i]==arr[j]&&j>i){
                ch=arr[i]
                count++
            }else if (arr[i]==arr[j]&&j<i){
                break
            }
        }
        println(count)
    }
}