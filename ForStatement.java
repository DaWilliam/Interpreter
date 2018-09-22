
public class ForStatement implements Statement {

	private ArithmeticExpression start;
	
	private Block blk;
	
	private ArithmeticExpression end;
	/**
	 * @param expr cannot be null
	 * @param blk cannot be null
	 * @throws IllegalArgumentException if either argument is 
	 */
	public ForStatement(ArithmeticExpression start, Block blk, ArithmeticExpression end)
	{
		if (start == null)
			throw new IllegalArgumentException ("null arithmetic expression argument");
		if (blk == null)
			throw new IllegalArgumentException ("null block argument");
		if(end == null)
			throw new IllegalArgumentException ("null arithmetic argument");
		this.start = start;
		this.blk = blk;
		this.end = end;
	}

	@Override
	public void execute()
	{		
		for(int i = start.evaluate(); i < end.evaluate(); i++)
			blk.execute();
	}
}
