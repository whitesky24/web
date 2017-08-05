import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dam {

	public static void main(String[] args) throws Exception {

        Document document = Jsoup.connect("http://www.clubdam.com/app/dam/dam/ranking/index.html").get();
            Elements elements = document.select("tr ");
//            System.out.println(elements);
            for(Element e: elements){
    		  System.out.println("ranking: " + e.select("td.ranking").text());
              System.out.println("song : " + e.select("td.song").text());
              System.out.println("singer : " + e.select("td.singer").text());
              System.out.println("request : " + e.select("td.request").text());
    		}
/*            JSONObject jobj = new JSONObject();
*/

            }
    }




