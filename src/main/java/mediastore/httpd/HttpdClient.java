package mediastore.httpd;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.springframework.stereotype.Component;

@Component
public class HttpdClient {

	private static final String SERVER_HOST = "localhost";
	private static final int PORT = 9876;
	
	public void sendImage(String imgPath, byte[] image) {
		
        //write to socket using ObjectOutputStream
		try(Socket socket = new Socket(SERVER_HOST, PORT);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
	        oos.writeObject(imgPath);
	        oos.writeObject(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
