package d03httpclient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 19:24
 * @Description
 */
public class HttpClientDemo1 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();


        for (int i = 0; i < 10; i++) {

            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com/tupian/" + (32361+i) + ".html")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String html = response.body();



            String prefix = "<a href=\"\" id=\"img\"><img src=\"";
            String suffix = "\" data-pic=";
            html = html.substring(html.indexOf(prefix) + prefix.length());
            html = html.substring(0, html.indexOf(suffix));
            System.out.println(html);  //最终的图片地址就有了

            HttpRequest imageRequest = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com/tupian/" + (32361+i) + ".html")).build();
            //这里以输入流的方式获取，不过貌似可以直接下载文件，各位小伙伴可以单独试试看
            HttpResponse<InputStream> imageResponse = client.send(imageRequest, HttpResponse.BodyHandlers.ofInputStream());
            //拿到输入流和文件输出流
            InputStream imageInput = imageResponse.body();
            FileOutputStream stream = new FileOutputStream("image/"+(32361+i)+".jpg"); //一会要保存的格式
            try (stream;imageInput){  //直接把要close的变量放进来就行，简洁一些了
                int size;   //下面具体保存过程的不用我多说了吧
                byte[] data = new byte[2048];
                while ((size = imageInput.read(data)) > 0) {
                    stream.write(data, 0, size);
                }
            }


        }
    }
}
