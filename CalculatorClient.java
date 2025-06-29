////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: CalculatorClient.java
// Description: This file contains the menu-driven calculator using socket communication
// Input: int
// Output: int
// Date: 29-06-2025
// Author: Ritesh Jillewad
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;
import java.util.*;

class CalculatorClient
{
    public static void main(String A[]) throws Exception
    {
        Socket socket = new Socket("localhost", 2100);

        DataInputStream ClientInput = new DataInputStream(socket.getInputStream());
        DataOutputStream ClientOutput = new DataOutputStream(socket.getOutputStream());

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("=================================");
            System.out.println("\n== Welcome To Calculator App ==");
            System.out.println("============= Menu =============");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("=================================");

            int iChoice = 0;
            System.out.print("Please enter your choice: \n");
            iChoice = scanner.nextInt();

            if(iChoice <= 0 || iChoice > 5)
            {
                System.out.println("Please enter a valid choice \n");
                continue;
            }

            ClientOutput.writeInt(iChoice);  

            if(iChoice == 5)
            {
                System.out.println("Exiting the application..\n");
                break;
            }

            System.out.print("Enter First Number: \n");
            int iNumber1 = scanner.nextInt();

            System.out.print("Enter Second Number: \n");
            int iNumber2 = scanner.nextInt();

            ClientOutput.writeInt(iNumber1);
            ClientOutput.writeInt(iNumber2);

            int iRet = ClientInput.readInt();
            System.out.println("Result fetched successfully from server.");
            System.out.println("Result: " + iRet);
        }

        System.out.println("End of Client Application. \n");
        socket.close();
        scanner.close();
    }
}
