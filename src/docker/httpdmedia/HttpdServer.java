package usr.local.apache2.htdocs;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpdServer {

	private static final int PORT = 9876;
	private static final String IMAGES_ON_DISK = "usr/local/apache2/htdocs";

	public static void main(String[] args) {

		try (ServerSocket serverSocket = new ServerSocket(PORT)){
			
			System.out.println("Waiting for client........");

			while(true){
				Socket client = serverSocket.accept();
				ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

				//convert ObjectInputStream object to String
				String imgPath = (String) ois.readObject();
				byte[] image = (byte[]) ois.readObject();
				
				try(FileOutputStream fos = new FileOutputStream(IMAGES_ON_DISK+imgPath)){	
					fos.write(image);
				}
			}

		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
