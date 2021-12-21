import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class main {


    public class main {
        static final String CITY = "Санкт-Петербург";
        static final String API_KEY = "0T6vjtrToroJUzAJ8MvDuVoR7SXrMuAr";

        public main() {
        }

        private static String getUrlContent(String urlAdress) {
            StringBuffer content = new StringBuffer();

            try {
                URL url = new URL(urlAdress);
                URLConnection urlConn = url.openConnection();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

                String line;
                while((line = bufferedReader.readLine()) != null) {
                    content.append(line + "\n");
                }

                bufferedReader.close();
            } catch (Exception var6) {
                System.out.println("Такого города нет в AccuWeather!");
            }

            return content.toString();
        }

        public static void main(String[] args) throws Exception {
            String addres = "https://developer.accuweather.com//data/2.5/forecast?q=Санкт-Петербург&appid0T6vjtrToroJUzAJ8MvDuVoR7SXrMuAr&units=metric";
            String answer = getUrlContent(addres);
            System.out.println(answer);
        }
    }
}
