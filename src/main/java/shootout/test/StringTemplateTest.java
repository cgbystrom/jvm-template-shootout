package shootout.test;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateWriter;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.NoIndentWriter;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import java.io.OutputStreamWriter;

import shootout.*;

public class StringTemplateTest extends TemplateTest implements TemplateRunnable
{
	private StringTemplateWriter output;
	private StringTemplate template;

	public StringTemplateTest(TestType test) throws Exception
	{
		super(test);

		StringTemplateGroup group = new StringTemplateGroup("myGroup", templateDir, DefaultTemplateLexer.class);
		useNullWriter();

		switch (test)
		{
			case STOCK_MARKET:
				// TODO: This template isn'template properly tested.
				// TODO: Has no if-statements since StringTemplate doesn't support conditionals
				template = group.getInstanceOf("stockmarket/stringtemplate");
				template.setAttribute("list", StockMarketContext.generateList());
				break;
			default:
				throw new Exception("Test not implemented");
		}
	}

	@Override
	public void useConsole()
	{
		output = new NoIndentWriter(new OutputStreamWriter(System.out));
	}

	@Override
	public void useNullWriter()
	{
		output = new NullStringTemplateWriter();
	}

	public void run(int loops) throws Exception
	{
		for (int i = 0; i < loops; i++)
		{
			template.write(output);
		}
	}
}