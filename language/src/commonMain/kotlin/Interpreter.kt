class Interpreter {
	fun run(sourceCode: String): String {
		val expression = parser.parseExpression(sourceCode)

		val result = expression.evaluate()

		return result.toString()
	}


	private val parser = Parser()
}
