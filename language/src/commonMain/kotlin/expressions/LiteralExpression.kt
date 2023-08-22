package expressions

import Expression

data class LiteralExpression<T>(
	val value: T,
) : Expression<T>() {
	override fun evaluate(): T {
		return value
	}
}
