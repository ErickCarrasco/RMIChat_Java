/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat;

/**
 *
 * @author xioma
 */
import java.rmi.*;
import java.util.Vector;
 
public interface ChatInterface extends Remote{
	public String getName() throws RemoteException;
	public void send(String msg) throws RemoteException;
        public void send(String msg, String userTarget) throws RemoteException;      
	public void setClient(ChatInterface c)throws RemoteException;
        public void setClient(String userName, ChatInterface c)throws RemoteException;
        public String leerArchivo() throws RemoteException;
	public void escribirArchivo(String msg) throws RemoteException;
	public Vector<ChatInterface> getClient() throws RemoteException;
}