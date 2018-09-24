/*
Team: David Waldorf, Richard Luthringshauser, William Shu
Date: 9/21/2018
*/
public class ForStatement implements Statement {

	private Id var;
	
	private Block blk;
	
	private ArithmeticExpression end;
	/**
	 * @param expr cannot be null
	 * @param blk cannot be null
	 * @throws IllegalArgumentException if either argument is 
	 */
	public ForStatement(Id var, Block blk, ArithmeticExpression end)
	{
		if (var == null)
			throw new IllegalArgumentException ("null arithmetic expression argument");
		if (blk == null)
			throw new IllegalArgumentException ("null block argument");
		if(end == null)
			throw new IllegalArgumentException ("null arithmetic argument");
		this.var = var;
		this.blk = blk;
		this.end = end;
	}

	@Override
	public void execute()
	{	
		for(int i = var.evaluate(); i <= end.evaluate(); i++)
		{
			Memory.store(var.getChar(), i);
			blk.execute();
		}
	}
}
