package shootout.test;

import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;
import groovy.lang.Writable;
import shootout.StockMarketContext;
import shootout.TemplateTest;
import shootout.TemplateRunnable;
import shootout.TestType;

public class GroovySimpleTemplateTest extends TemplateTest implements TemplateRunnable
{
	Writable template;

	public GroovySimpleTemplateTest(TestType test) throws Exception
	{
		super(test);
		SimpleTemplateEngine engine = new SimpleTemplateEngine();

		switch (test)
		{
			case STOCK_MARKET:
				Template t = engine.createTemplate(getTemplateFile("stockmarket/simplegroovy"));
				template = t.make(StockMarketContext.generateMap());
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.writeTo(output);
		}
	}
}