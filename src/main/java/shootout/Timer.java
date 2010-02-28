package shootout;

import java.lang.management.ThreadMXBean;
import java.lang.management.ManagementFactory;

public class Timer
{
	ThreadMXBean bean = ManagementFactory.getThreadMXBean();

	long startRealTime;
	long startCpuTime;
	long startUserTime;
	long startSystemTime;
	long endRealTime;
	long endCpuTime;
	long endUserTime;
	long endSystemTime;

	public void start()
	{
		startRealTime = System.nanoTime();
		startCpuTime = _getCpuTime();
		startUserTime = _getUserTime();
		startSystemTime = _getSystemTime();
	}

	public void stop()
	{
		endRealTime = System.nanoTime();
		endCpuTime = _getCpuTime();
		endUserTime = _getUserTime();
		endSystemTime = _getSystemTime();
	}

	public long getRealTime()
	{
		return (endRealTime - startRealTime) / 1000000;
	}

	public long getCpuTime()
	{
		return (endCpuTime - startCpuTime) / 1000000;
	}

	public long getUserTime()
	{
		return (endUserTime - startUserTime) / 1000000;
	}

	public long getSystemTime()
	{
		return (endSystemTime - startSystemTime) / 1000000;
	}

	private long _getCpuTime()
	{
		return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : 0L;
	}

	private long _getUserTime()
	{
		return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadUserTime() : 0L;
	}

	private long _getSystemTime()
	{
		return bean.isCurrentThreadCpuTimeSupported() ?	(bean.getCurrentThreadCpuTime() - bean.getCurrentThreadUserTime()) : 0L;
	}
}
