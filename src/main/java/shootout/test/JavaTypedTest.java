package shootout.test;

import shootout.TemplateTest;
import shootout.JavaStockMarketTemplate;
import shootout.TestType;
import shootout.StockMarketContext;

import java.util.List;

public class JavaTypedTest extends TemplateTest
{
	JavaStockMarketTemplate template;
	List<StockMarketContext.Stock> context = StockMarketContext.generateTyped();

	public JavaTypedTest(TestType type) throws Exception
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
			template.renderTyped(context, output);
		}
	}
}