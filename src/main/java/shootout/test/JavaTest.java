package shootout.test;

import shootout.TemplateTest;
import shootout.JavaStockMarketTemplate;
import shootout.TestType;
import shootout.StockMarketContext;

import java.util.Map;

public class JavaTest extends TemplateTest
{
	JavaStockMarketTemplate template;
	Map context = StockMarketContext.generateMap();

	public JavaTest(TestType type) throws Exception
	{
		super(type);

		switch (type)
		{
			case STOCK_MARKET:
				template = new JavaStockMarketTemplate();
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.render(context, output);
		}
	}
}
