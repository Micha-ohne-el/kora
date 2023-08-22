class Interpreter(
	private val expressionParser: CanParseExpression = Parser(),
) {
	fun run(sourceCode: String): String {
		val expression = expressionParser.parseExpression(sourceCode)

		val result = expression.evaluate()

		return result.toString()
	}
}
