package shootout.test;

import java.io.FileReader;
import java.util.Map;

import jste.template.Template;
import shootout.StockMarketContext;
import shootout.TemplateTest;
import shootout.TemplateRunnable;
import shootout.TestType;

public class JsteTest extends TemplateTest implements TemplateRunnable
{
	Map context;
	Template template;

	public JsteTest(TestType test) throws Exception
	{
		super(test);
		switch (test)
		{
			case STOCK_MARKET:
				context = StockMarketContext.generateMap();
				template = new Template(new FileReader(getTemplate("stockmarket/jste.tpl")));
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.expand(context, output);
		}
	}
}