import java.util.Scanner;

fun main(args: Array<String>) {
   //continue o codigo
   val leitor = readLine()!!.toString()
   
   var entrada = leitor.toString().split(' ')
   
   var H: Int = entrada[0].toInt()
   var P: Int = entrada[1].toInt()
    
   val media: Double = H.toDouble() / P.toDouble();
   println(String.format("%.2f", media));
}
