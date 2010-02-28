package shootout;

import java.io.Writer;
import java.io.IOException;

public class NullWriter extends Writer
{
	private Writer parentWriter;

	public NullWriter()
	{
		super();
	}

	public NullWriter(Object lock)
	{
		super(lock);
	}

	public NullWriter(Writer parentWriter)
	{
		super();
		this.parentWriter = parentWriter;
	}

	public Writer getParentWriter()
	{
		return parentWriter;
	}

	public void write(int c) throws IOException
	{
	}

	public void write(char cbuf[]) throws IOException
	{
	}

	public void write(String str) throws IOException
	{
	}

	public void write(String str, int off, int len) throws IOException
	{
	}

	public Writer append(CharSequence csq) throws IOException
	{
		return this;
	}

	public Writer append(CharSequence csq, int start, int end) throws IOException
	{
		return this;
	}

	public Writer append(char c) throws IOException
	{
		return this;
	}

	public void write(char cbuf[], int off, int len) throws IOException
	{
	}

	public void flush() throws IOException
	{
	}

	public void close() throws IOException
	{
	}
}