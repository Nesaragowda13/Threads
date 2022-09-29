
public class B_printer implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try {
			System.out.println("B");
			Thread.sleep(1000);
			System.out.println("B");
			Thread.sleep(1000);
					System.out.println("B");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in B_printer run:"+e.getMessage());
		}
		
	}

}
