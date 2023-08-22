import expressions.LiteralExpression

class Parser {
	fun parseExpression(sourceCode: String): Expression<*> {
		return LiteralExpression(sourceCode)
	}
}
