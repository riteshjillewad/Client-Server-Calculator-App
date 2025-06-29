////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: CalculatorServer.java
// Description: This file contains the arithmetic operation logic
// Input: int
// Output: int
// Date: 29-06-2025
// Author: Ritesh Jillewad
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class CalculatorServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket serversocket = new ServerSocket(2100);
        System.out.println("The Server is waiting at port 2100.\n");

        Socket socket = serversocket.accept();
        System.out.println("Client request arrives and is connected successfully.\n");

        DataInputStream ServerInput = new DataInputStream(socket.getInputStream());
        DataOutputStream ServerOutput = new DataOutputStream(socket.getOutputStream());

        while(true)
        {
            int iChoice = ServerInput.readInt();

            if(iChoice == 5)
            {
                System.out.println("Client Exited. Shutting down the server.\n");
                break;
            }

            int iValue1 = ServerInput.readInt();
            int iValue2 = ServerInput.readInt();
            int iResult = 0;

            switch(iChoice)
            {
                case 1:
                    iResult = (iValue1 + iValue2);
                    break;

                case 2:
                    iResult = (iValue1 - iValue2);
                    break;

                case 3:
                    iResult = (iValue1 * iValue2);
                    break;

                case 4:
                    if(iValue2 != 0)
                        iResult = iValue1 / iValue2;
                    else
                        iResult = 0; 
                    break;

                default:
                    iResult = 0;
            }

            ServerOutput.writeInt(iResult);
        }

        socket.close();
        serversocket.close();
    }
}
