package shootout.test;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;

import java.util.Properties;

import shootout.StockMarketContext;
import shootout.TemplateTest;
import shootout.TemplateRunnable;
import shootout.TestType;

public class VelocityTest extends TemplateTest implements TemplateRunnable
{
	Template template;
	VelocityContext context;

	public VelocityTest(TestType test) throws Exception
	{
		super(test);

		Properties p = new Properties();
		p.setProperty("resource.loader", "file");
		p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
		p.setProperty("file.resource.loader.path", templateDir);
		Velocity.init(p);

		switch (test)
		{
			case STOCK_MARKET:
				template = Velocity.getTemplate("stockmarket/velocity");
				context = StockMarketContext.generateVelocity();
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.merge(context, output);
		}
	}
}