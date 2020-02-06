package sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConexionHilo {


    public static String conectar(String operacion) throws IOException{
        Socket clienteSocket = new Socket();
        InetSocketAddress addr=new InetSocketAddress("10.0.9.133",5555);
        clienteSocket.connect(addr);

        InputStream is = clienteSocket.getInputStream();
        OutputStream os= clienteSocket.getOutputStream();

        os.write(operacion.getBytes());

        byte[] resultado = new byte[25];
        is.read(resultado);

        String resul = new String(resultado);

        clienteSocket.close();

        return resul;

    }

}
