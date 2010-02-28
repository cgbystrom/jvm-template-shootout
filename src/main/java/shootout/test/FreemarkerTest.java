package shootout.test;

import java.io.File;

import freemarker.template.Template;
import freemarker.template.Configuration;
import freemarker.template.SimpleHash;
import shootout.StockMarketContext;
import shootout.TemplateTest;
import shootout.TemplateRunnable;
import shootout.TestType;

public class FreemarkerTest extends TemplateTest implements TemplateRunnable
{
	protected Template template;
	protected SimpleHash context;

	public FreemarkerTest(TestType test) throws Exception
	{
		super(test);
		Configuration cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(new File(templateDir));
		switch (test)
		{
			case STOCK_MARKET:
				template = cfg.getTemplate("stockmarket/freemarker");
				context = StockMarketContext.generateFreemarker();
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.process(context, output);
		}
	}
}
