package shootout;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.*;

public class JavaStockMarketTemplate
{
	private String header;
	private String footer;

	public JavaStockMarketTemplate() throws IOException
	{
		String headerPath = this.getClass().getClassLoader().getResource("stockmarket/header.tpl").getFile();
		String footerPath = this.getClass().getClassLoader().getResource("stockmarket/footer.tpl").getFile();

		header = readFileAsString(headerPath);
		footer = readFileAsString(footerPath);
	}

	public void render(Map context, Writer output) throws IOException
	{
		List list = (List)context.get("list");
		output.write(header);

		int size = list.size();
		for (int i = 0; i < size; i++)
		{
			if (i % 2 == 1) {
				output.write("            <tr class=\"even\">\n");
			} else {
				output.write("            <tr class=\"odd\">\n");
			}

			HashMap h = (HashMap)list.get(i);

			output.write("                <td style=\"text-align: center\">");
			output.write(String.valueOf(i + 1));
			output.write("</td>\n");

			output.write("                <td><a href=\"/stocks/\"");
			output.write((String)h.get("symbol"));
			output.write("\">");
			output.write((String)h.get("symbol"));
			output.write("</a></td>\n");
			output.write("                <td><a href=\"");
			output.write((String)h.get("url"));
			output.write("\">");
			output.write((String)h.get("name"));
			output.write("</a></td>\n");
			output.write("                <td><strong>");
			output.write(String.valueOf(h.get("price")));
			output.write("</strong></td>\n");
			if ((Double)h.get("change") < 0.0) {
				output.write("                <td class=\"minus\">");
				output.write(String.valueOf(h.get("change")));
				output.write("</td>\n");
				output.write("                <td class=\"minus\">");
				output.write(String.valueOf(h.get("ratio")));
				output.write("</td>\n");
			} else {
				output.write("                <td>");
				output.write(String.valueOf(h.get("change")));
				output.write("</td>\n");
				output.write("                <td>");
				output.write(String.valueOf(h.get("ratio")));
				output.write("</td>\n");
			}

			output.write("            </tr>\n");
		}
		output.write(footer);
		output.flush();
	}

	public void renderTyped(List<StockMarketContext.Stock> stocks, Writer output) throws IOException
		{
			output.write(header);

			int size = stocks.size();
			for (int i = 0; i < size; i++)
			{
				StockMarketContext.Stock s = stocks.get(i);
				if (i % 2 == 1) {
					output.write("            <tr class=\"even\">\n");
				} else {
					output.write("            <tr class=\"odd\">\n");
				}

				output.write("                <td style=\"text-align: center\">");
				output.write(String.valueOf(i + 1));
				output.write("</td>\n");

				output.write("                <td><a href=\"/stocks/\"");
				output.write(s.symbol);
				output.write("\">");
				output.write(s.symbol);
				output.write("</a></td>\n");
				output.write("                <td><a href=\"");
				output.write(s.url);
				output.write("\">");
				output.write(s.name);
				output.write("</a></td>\n");
				output.write("                <td><strong>");
				output.write(String.valueOf(s.price));
				output.write("</strong></td>\n");
				if (s.change < 0.0) {
					output.write("                <td class=\"minus\">");
					output.write(String.valueOf(s.change));
					output.write("</td>\n");
					output.write("                <td class=\"minus\">");
					output.write(String.valueOf(s.ratio));
					output.write("</td>\n");
				} else {
					output.write("                <td>");
					output.write(String.valueOf(s.change));
					output.write("</td>\n");
					output.write("                <td>");
					output.write(String.valueOf(s.ratio));
					output.write("</td>\n");
				}

				output.write("            </tr>\n");
			}
			output.write(footer);
			output.flush();
		}


	private static String readFileAsString(String filePath) throws java.io.IOException
	{
		byte[] buffer = new byte[(int) new File(filePath).length()];
		BufferedInputStream f = new BufferedInputStream(new FileInputStream(filePath));
		f.read(buffer);
		return new String(buffer);
	}
}
