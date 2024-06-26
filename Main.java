import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Agregar encabezado User-Agent
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if(responseCode == 200){
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                System.out.println("respuesta: " + response.toString());

                connection.disconnect();
            } else {
                throw new RuntimeException("Error we: " + responseCode);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
