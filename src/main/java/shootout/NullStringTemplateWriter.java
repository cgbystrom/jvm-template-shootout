package shootout;

import org.antlr.stringtemplate.StringTemplateWriter;

import java.io.IOException;

public class NullStringTemplateWriter implements StringTemplateWriter
{
	public void pushIndentation(String s)
	{
	}

	public String popIndentation()
	{
		return null;
	}

	public void pushAnchorPoint()
	{
	}

	public void popAnchorPoint()
	{
	}

	public void setLineWidth(int i)
	{
	}

	public int write(String s) throws IOException
	{
		return 0;
	}

	public int write(String s, String s1) throws IOException
	{
		return 0;
	}

	public int writeWrapSeparator(String s) throws IOException
	{
		return 0;
	}

	public int writeSeparator(String s) throws IOException
	{
		return 0;
	}
}
