package org.thebubbleindex.model;

public class CompositeEighty extends BubbleIndexTimeseries {
   
	protected CompositeEighty() {}
	
	public CompositeEighty(final String name, final String symbol, final String dtype, final String keywords) {
		this.symbol = symbol;
		this.dtype = dtype;		
		this.name = name;
		this.keywords = keywords;
	}
}
