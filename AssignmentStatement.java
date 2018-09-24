/*
Team: David Waldorf, Richard Luthringshauser, William Shu
Date: 9/21/2018
Changes: Added getId() method at line 34
*/
public class AssignmentStatement implements Statement
{
	
	private Id var;
	
	private ArithmeticExpression expr;

	/**
	 * @param var cannot be null
	 * @param expr cannot be null
	 * @throws IllegalArgumentException if either var or expr is null
	 */
	public AssignmentStatement(Id var, ArithmeticExpression expr)
	{
		if (var == null)
			throw new IllegalArgumentException ("null Id argument");
		if (expr == null)
			throw new IllegalArgumentException ("null ArithmeticExpression argument");
		this.var = var;
		this.expr = expr;
	}

	@Override
	public void execute()
	{
		Memory.store (var.getChar(), expr.evaluate());
	}
	
	public Id getId()
	{
		return var;
	}
}
