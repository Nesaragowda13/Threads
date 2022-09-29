
public class C_printer implements Runnable
{

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		try {
			System.out.println("C");
			Thread.sleep(2000);
			System.out.println("c");
			Thread.sleep(2000);
					System.out.println("c");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in B_printer run:"+e.getMessage());
		}
		
	}
		
	}


