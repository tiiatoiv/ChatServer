import java.io.InputStream
import java.io.PrintStream
import java.util.Scanner

public class ChatConnector(inputStream: InputStream, out: PrintStream) {

    fun run(){
        //creates a scanner for reading user input
        val scanner1 = Scanner(System.`in`)
        println("Insert message")
        val userinput: String = scanner1.nextLine()

        //creates an object of ChatMessage type of the user input
        val messageObject = ChatMessage(userinput)
        print(messageObject)
    }
}