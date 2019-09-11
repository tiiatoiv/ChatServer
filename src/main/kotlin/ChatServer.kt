import java.net.ServerSocket

class ChatServer{
    fun serve() {
        try {
            val serverSocket = ServerSocket(30001, 3)
            val chatConnector = ChatConnector(System.`in`, System.out)
            chatConnector.run()
            while(true) {
                val s = serverSocket.accept()
                println("new connection " + s.inetAddress.hostAddress + " " + s.port)

                val t = Thread(ChatConnector(s.getInputStream(), s.getOutputStream()))
                t.start()
            }
        } catch (e: Exception) {
            println("Got exception: ${e.message}")
        } finally {
            println("Server opened")
        }
    }
}