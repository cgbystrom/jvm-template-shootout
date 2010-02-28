package shootout;

import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.File;

public abstract class TemplateTest implements TemplateRunnable
{
	protected Writer output = new NullWriter();
	protected String templateDir;
	protected TestType type;

	protected TemplateTest()
	{
		String path = this.getClass().getClassLoader().getResource("context.json").getFile();
		templateDir = path.substring(0, path.lastIndexOf('/'));
	}

	public TemplateTest(TestType type)
	{
		this();
		this.type = type;
	}

	public void useConsole()
	{
		output = new OutputStreamWriter(System.out);
	}

	public void useNullWriter()
	{
		output = new NullWriter();
	}

	public String getTemplate(String file)
	{
		return this.getClass().getClassLoader().getResource("" + file).getFile();
	}

	public File getTemplateFile(String file)
	{
		return new File(getTemplate(file));
	}
}
