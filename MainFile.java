
public class MainFile
{
public static void main(String[] args)
{
	B_printer bp = new B_printer();
	C_printer cp = new C_printer();
	Thread t_bp = new Thread(bp);
	Thread t_cp = new Thread(cp);
	t_bp.start();
	t_cp.start();
}
}
