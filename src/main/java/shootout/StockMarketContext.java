package shootout;

import freemarker.template.SimpleHash;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.apache.velocity.VelocityContext;

public class StockMarketContext
{
	public static List generateList()
	{
		List list = new ArrayList();
		Map map;

		map = new HashMap();
		map.put("name", "Adobe Systems");
		map.put("name2", "Adobe Systems Inc.");
		map.put("url", "http://www.adobe.com");
		map.put("symbol", "ADBE");
		map.put("price", 39.26);
		map.put("change", 0.13);
		map.put("ratio", 0.33);
		list.add(map);

		map = new HashMap();
		map.put("name", "Advanced Micro Devices");
		map.put("name2", "Advanced Micro Devices Inc.");
		map.put("url", "http://www.amd.com");
		map.put("symbol", "AMD");
		map.put("price", 16.22);
		map.put("change", 0.17);
		map.put("ratio", 1.06);
		list.add(map);

		map = new HashMap();
		map.put("name", "Amazon.com");
		map.put("name2", "Amazon.com Inc");
		map.put("url", "http://www.amazon.com");
		map.put("symbol", "AMZN");
		map.put("price", 36.85);
		map.put("change", -0.23);
		map.put("ratio", -0.62);
		list.add(map);

		map = new HashMap();
		map.put("name", "Apple");
		map.put("name2", "Apple Inc.");
		map.put("url", "http://www.apple.com");
		map.put("symbol", "AAPL");
		map.put("price", 85.38);
		map.put("change", -0.87);
		map.put("ratio", -1.01);
		list.add(map);

		map = new HashMap();
		map.put("name", "BEA Systems");
		map.put("name2", "BEA Systems Inc.");
		map.put("url", "http://www.bea.com");
		map.put("symbol", "BEAS");
		map.put("price", 12.46);
		map.put("change", 0.09);
		map.put("ratio", 0.73);
		list.add(map);

		map = new HashMap();
		map.put("name", "CA");
		map.put("name2", "CA, Inc.");
		map.put("url", "http://www.ca.com");
		map.put("symbol", "CA");
		map.put("price", 24.66);
		map.put("change", 0.38);
		map.put("ratio", 1.57);
		list.add(map);

		map = new HashMap();
		map.put("name", "Cisco Systems");
		map.put("name2", "Cisco Systems Inc.");
		map.put("url", "http://www.cisco.com");
		map.put("symbol", "CSCO");
		map.put("price", 26.35);
		map.put("change", 0.13);
		map.put("ratio", 0.5);
		list.add(map);

		map = new HashMap();
		map.put("name", "Dell");
		map.put("name2", "Dell Corp.");
		map.put("url", "http://www.dell.com/");
		map.put("symbol", "DELL");
		map.put("price", 23.73);
		map.put("change", -0.42);
		map.put("ratio", -1.74);
		list.add(map);

		map = new HashMap();
		map.put("name", "eBay");
		map.put("name2", "eBay Inc.");
		map.put("url", "http://www.ebay.com");
		map.put("symbol", "EBAY");
		map.put("price", 31.65);
		map.put("change", -0.8);
		map.put("ratio", -2.47);
		list.add(map);

		map = new HashMap();
		map.put("name", "Google");
		map.put("name2", "Google Inc.");
		map.put("url", "http://www.google.com");
		map.put("symbol", "GOOG");
		map.put("price", 495.84);
		map.put("change", 7.75);
		map.put("ratio", 1.59);
		list.add(map);

		map = new HashMap();
		map.put("name", "Hewlett-Packard");
		map.put("name2", "Hewlett-Packard Co.");
		map.put("url", "http://www.hp.com");
		map.put("symbol", "HPQ");
		map.put("price", 41.69);
		map.put("change", -0.02);
		map.put("ratio", -0.05);
		list.add(map);

		map = new HashMap();
		map.put("name", "IBM");
		map.put("name2", "International Business Machines Corp.");
		map.put("url", "http://www.ibm.com");
		map.put("symbol", "IBM");
		map.put("price", 97.45);
		map.put("change", -0.06);
		map.put("ratio", -0.06);
		list.add(map);

		map = new HashMap();
		map.put("name", "Intel");
		map.put("name2", "Intel Corp.");
		map.put("url", "http://www.intel.com");
		map.put("symbol", "INTC");
		map.put("price", 20.53);
		map.put("change", -0.07);
		map.put("ratio", -0.34);
		list.add(map);

		map = new HashMap();
		map.put("name", "Juniper Networks");
		map.put("name2", "Juniper Networks, Inc");
		map.put("url", "http://www.juniper.net/");
		map.put("symbol", "JNPR");
		map.put("price", 18.96);
		map.put("change", 0.5);
		map.put("ratio", 2.71);
		list.add(map);

		map = new HashMap();
		map.put("name", "Microsoft");
		map.put("name2", "Microsoft Corp");
		map.put("url", "http://www.microsoft.com");
		map.put("symbol", "MSFT");
		map.put("price", 30.6);
		map.put("change", 0.15);
		map.put("ratio", 0.49);
		list.add(map);

		map = new HashMap();
		map.put("name", "Oracle");
		map.put("name2", "Oracle Corp.");
		map.put("url", "http://www.oracle.com");
		map.put("symbol", "ORCL");
		map.put("price", 17.15);
		map.put("change", 0.17);
		map.put("ratio", 1.0);
		list.add(map);

		map = new HashMap();
		map.put("name", "SAP");
		map.put("name2", "SAP AG");
		map.put("url", "http://www.sap.com");
		map.put("symbol", "SAP");
		map.put("price", 46.2);
		map.put("change", -0.16);
		map.put("ratio", -0.35);
		list.add(map);

		map = new HashMap();
		map.put("name", "Seagate Technology");
		map.put("name2", "Seagate Technology");
		map.put("url", "http://www.seagate.com/");
		map.put("symbol", "STX");
		map.put("price", 27.35);
		map.put("change", -0.36);
		map.put("ratio", -1.3);
		list.add(map);

		map = new HashMap();
		map.put("name", "Sun Microsystems");
		map.put("name2", "Sun Microsystems Inc.");
		map.put("url", "http://www.sun.com");
		map.put("symbol", "SUNW");
		map.put("price", 6.33);
		map.put("change", -0.01);
		map.put("ratio", -0.16);
		list.add(map);

		map = new HashMap();
		map.put("name", "Yahoo");
		map.put("name2", "Yahoo! Inc.");
		map.put("url", "http://www.yahoo.com");
		map.put("symbol", "YHOO");
		map.put("price", 28.04);
		map.put("change", -0.17);
		map.put("ratio", -0.6);
		list.add(map);

		return list;
	}

	public static Map generateMap()
	{
		HashMap context = new HashMap();
		context.put("list", generateList());
		return context;
	}

	public static SimpleHash generateFreemarker()
	{
		SimpleHash context = new SimpleHash();
		context.put("list", generateList());
		return context;
	}

	public static VelocityContext generateVelocity()
	{
		VelocityContext context = new VelocityContext();
		context.put("list", generateList());
		return context;
	}
}
