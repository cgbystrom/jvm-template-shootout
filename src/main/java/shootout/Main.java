package shootout;

import shootout.test.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)
		{
			System.err.println("Invalid arguments given!");
			System.out.println("Usage: java -jar <jar-file> [iterations] [warmup iterations]");
			System.exit(1);
		}

		int loops = Integer.parseInt(args[0]);
		int warmupLoops = Integer.parseInt(args[1]);

		TemplateRunner runner = new TemplateRunner(loops, warmupLoops);
		runner.addTypes(TestType.STOCK_MARKET);
		runner.addTests(GroovySimpleTemplateTest.class);
		runner.addTests(JsteTest.class);
		runner.addTests(StringTemplateTest.class);
		runner.addTests(VelocityTest.class);
		runner.addTests(FreemarkerTest.class);
		runner.addTests(JavaTest.class);
		runner.addTests(JavaTypedTest.class);
		runner.run();
	}
}
