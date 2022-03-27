public class SyncTest 
{
	public static void main(String args[]){

		SyncContainer container=new SyncContainer();
		Thread pro=new Thread(new Producer(container),"Producer");
		Thread con=new Thread(new Consumer(container),"Consumer");
		pro.start();
		con.start();
		try {
			pro.join();
			con.join();
			//main thread waiting for both thread to return
			System.out.println("Both returned");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}