import java.rmi.*;
import java.rmi.server.*;


public class  ServerImpl extends UnicastRemoteObject
    implements ServerIntf
{
   public ServerImpl() throws RemoteException
   {
       
   }
   
   public double addition(double num1,double num2) throws RemoteException{
       return num1+num2;
   }
    public double substraction(double num1,double num2) throws RemoteException{
        return num1-num2;
    }
    public double multiplication(double num1,double num2) throws RemoteException{
        return num1*num2;
    }
    public double division(double num1,double num2) throws RemoteException{
         return num1/num2;
    }
}