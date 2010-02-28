package shootout;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TemplateRunner
{
	private int loops;
	private int warmupLoops;
	private List<Class<? extends TemplateTest>> tests = new ArrayList<Class<? extends TemplateTest>>();
	private List<TestType> testTypes = new ArrayList<TestType>();

	public TemplateRunner(int loops, int warmupLoops)
	{
		this.loops = loops;
		this.warmupLoops = warmupLoops;
	}

	public void addTests(Class<? extends TemplateTest>... tests)
	{
		this.tests.addAll(Arrays.asList(tests));
	}

	public void addTypes(TestType... types)
	{
		testTypes.addAll(Arrays.asList(types));
	}

	public void run() throws Exception
	{
		System.out.println("       Iterations: " + loops);
		System.out.println("Warmup iterations: " + warmupLoops);
		System.out.println("");

		for (TestType type : testTypes)
		{
			System.out.println("Test: " + type);
			printHeader();
			for (Class<? extends TemplateTest> testClass : tests)
			{
				Timer timer = new Timer();
				TemplateTest test = (TemplateTest) testClass.getDeclaredConstructors()[0].newInstance(type);

				test.run(warmupLoops);

				timer.start();
				test.run(loops);
				timer.stop();

				printResult(timer, testClass);
			}
		}
	}

	public void printHeader()
	{
		System.out.println(String.format("%30s |     Real |     User |   System |      CPU |   tpls/sec |   ms/tpl", "Test"));
		System.out.print(String.format("---------------------------------------------------"));
		System.out.println(String.format("------------------------------------------------"));
	}

	public void printResult(Timer timer, Class test)
	{
		String engine = test.getSimpleName();

		String out = String.format("%30s %10d %10d %10d %10d %11.2f %10.2f",
				engine,
				timer.getRealTime(),
				timer.getUserTime(),
				timer.getSystemTime(),
				timer.getCpuTime(),
				((double)loops / (double)timer.getCpuTime()) * 1000.0,
				(double)timer.getCpuTime() / loops);
		System.out.println(out);
	}
}
