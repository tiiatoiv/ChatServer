fun main(args: Array<String>) {
    val chatConnector = ChatConnector(System.`in`, System.out)
    chatConnector.run()
}