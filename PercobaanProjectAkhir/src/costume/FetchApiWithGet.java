/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;

    
public class FetchApiWithGet {
    public static void main(String[] args) {
        try {
            // URL tujuan
            String url = "https://waotp.avrizal.my.id/api/generate-otp";

            // JSON Body
            String jsonBody = """
                    {
                        "userId": "bhdas",
                        "phoneNumber": "6287809560225"
                    }
                    """;
            // Membuat HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Membuat HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .method("GET", BodyPublishers.ofString(jsonBody)) // Body disertakan pada GET
                    .build();

            // Mengirim permintaan dan menerima respons
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Output respons
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
