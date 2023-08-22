import expressions.LiteralExpression

class Parser : CanParseExpression {
	override fun parseExpression(sourceCode: String): Expression<*> {
		return LiteralExpression(sourceCode)
	}
}
