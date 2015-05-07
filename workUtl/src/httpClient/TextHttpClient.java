package httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;


public class TextHttpClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TextHttpClient http = new TextHttpClient();
		
		//http.upload();
		/*for(int i=0;i<1;i++){
			http.httpClient();
			System.out.println(i);
		}*/
	}
	
	public void httpClient(){
		 //网上很多教程使用的都是：HttpClient httpClient = new DefaultHttpClient();
		 //但是httpclient4.3提供了全新的实现类：CloseableHttpClient
		 CloseableHttpClient httpclient = HttpClients.createDefault();
		 //HttpPost httppost = new HttpPost("http://localhost:8080/httpClient.html");
		 HttpGet httpget = new HttpGet("http://localhost:8080/httpClient.html");
		 CloseableHttpResponse response = null;
		 try {
			response = httpclient.execute(httpget);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				response.close();
				httpclient.close();
			} catch (IOException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	public void upload() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost("http://localhost:8080/httpClient.html");

            FileBody bin = new FileBody(new File("D:\\html5\\bg_logo.jpg"));
            StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);

            HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("bin", bin).addPart("comment", comment).build();

            httppost.setEntity(reqEntity);

            System.out.println("executing request " + httppost.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                System.out.println("--------------------11--------------------");
                System.out.println(response.getStatusLine());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    System.out.println("Response content length: " + resEntity.getContentLength());
                }
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
