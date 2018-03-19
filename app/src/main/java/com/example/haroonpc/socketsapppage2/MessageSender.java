package com.example.haroonpc.socketsapppage2;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by haroonpc on 3/19/2018.
 */

public class MessageSender extends AsyncTask<String,Void,String>
{
    @Override
    protected String doInBackground(String... params) {

        String message = params[0];
        try
        {
            Socket mySocket = new Socket("192.168.1.2",8284);
            DataOutputStream dos = new DataOutputStream(mySocket.getOutputStream());
            dos.writeUTF(message);
            dos.close();
            mySocket.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
