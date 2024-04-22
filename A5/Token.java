import java.util.Scanner;

class TokenRing{
    public void run(int n, int send, int recv, int token) throws InterruptedException
    {
        for(int i=token; i!=send; i=(i+1)%n)
        {
            System.out.println("Token passed from node "+i+" to node "+(i+1)%n);
            Thread.sleep(1000);
        }
        System.out.println("Token Received to sender node, it is Uploading the data");
        System.out.println("Uploading.........");
        Thread.sleep(2000);
        for(int i=send; i!=recv; i=(i+1)%n)
        {
            System.out.println("Token passed from node "+i+" to node "+(i+1)%n);
            Thread.sleep(1000);
        }
        System.out.println("Token Received to receiver node, it is Downloading the data");
        System.out.println("Downloading.........");
        Thread.sleep(2000);
        System.out.println("Transmiaaion Completed Successfully");
    }
    
}

class Token{
	public static void main(String args[])
	{
		int n, send, recv, temp=0, ch=1;
		int token; // Token carrying node
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes in the network : ");
		n = sc.nextInt();
		do{
		    token = temp;
			System.out.println("Enter the sender node number : ");
			send = sc.nextInt();
			System.out.println("Enter the receiver node number : ");
			recv = sc.nextInt();
			temp = recv;
			TokenRing obj = new TokenRing();
			try{ obj.run(n, send, recv, token); }
			catch(InterruptedException e){};
			System.out.println("Do you want to do Transmission again ? (Enter 0 for No and 1 for Yes):");
			ch = sc.nextInt();
		}while(ch!=0);
	}
}