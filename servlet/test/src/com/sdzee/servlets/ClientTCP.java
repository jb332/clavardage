package com.sdzee.servlets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.AbstractMap.SimpleEntry;

import com.clava.serializable.Interlocuteurs;
import com.clava.serializable.Message;
public class ClientTCP {

	/**
	 * 
	 * @param m le message
	 * @param p la personne à qui l'envoyer
	 * @throws IOException
	 */
    public void sendMessage (Message m, Interlocuteurs p) throws IOException{ //String data, Personne dest, Personne emmet
    	for(SimpleEntry<InetAddress,Integer> a:p.getAddressAndPorts()) {
        //Initier la connexion
        Socket s = new Socket (a.getKey(),a.getValue()); //127.0.0.1 == localhost
        //Set up OUTput streams
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //Envoyer les datas       
        try {
			byte[] byteMessage = Message.serialize(m);
			int len = byteMessage.length;
			dos.writeInt(len);
			if (len > 0) {
			    dos.write(byteMessage, 0, len);
			    dos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        //Clore la connexion
        dos.close();
        os.close();
        s.close();	  
    	}
	}

}
