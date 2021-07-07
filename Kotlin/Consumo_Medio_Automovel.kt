import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    //continue o código
    var x: Float = leitor.nextFloat();
    var y: Float = leitor.nextFloat();
    
    var media = x/y
    

    println(String.format("%.3f km/l", media));
}
