package api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiCotacaoDolar {

    private static final String API_URL = "https://api.currencyfreaks.com/v2.0/rates/latest?apikey=";
    private static final String API_KEY = "11dc5b9f68f744a78d2bafab2591207a";

    public static double getCotacaoDolar() throws IOException {
        String urlString = API_URL + API_KEY + "&symbols=USD";
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int respondeCode = connection.getResponseCode();
        if (respondeCode == 200) {
            Scanner scanner = new Scanner(url.openStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Processa a resposta JSON como string
            String responseBody = response.toString();
            String searchKey = "\"USD\":";
            int startIndex = responseBody.indexOf(searchKey) + searchKey.length();
            int endIndex = responseBody.indexOf(",", startIndex);
            if (endIndex == -1) {
                endIndex = responseBody.indexOf("}", startIndex);
            }

            // Extrai e converte o valor da cotação
            String cotacaoString = responseBody.substring(startIndex, endIndex).trim();
            cotacaoString = cotacaoString.replace("\"", "");
            return Double.parseDouble(cotacaoString);
        } else {
            throw new IOException("Erro ao obter cotação do dólar: " + respondeCode);
        }
    }
}
