fun main(){

    val arr= arrayOf(1, 2, 3, 4, 5)
    var sum=0
    if (arr.isNotEmpty()) {
        for (element in arr) {
            sum += element
        }
        val average = sum / arr.size
        print(average)
    }else{
        print(0)
    }


}