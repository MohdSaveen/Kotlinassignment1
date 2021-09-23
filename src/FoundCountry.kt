import java.util.*

fun main(){
    val scanner= Scanner(System.`in`)
    val n=scanner.nextInt()
    val str1= arrayOfNulls<String>(n)
    for (i in str1.indices){
        str1[i]=scanner.next()
    }
    val name=scanner.next()
    for (i in str1.indices){
        if (str1[i].equals(name)){
            println("Country Found")
        }else{
            println("Not Found")
            break
        }
    }
}