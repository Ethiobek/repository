
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		Payment pay=new Payment();
		Efiling file=new Efiling();
		Notification nf=new Notification();
		
		user.setUserId("1234");
		user.setUserName("Elias Ayele");
		
		file.setTaxLevel('A');
		file.setDailyIncom(4000);
		pay.setIsPaid(true);
		
		double payment=file.getTaxAmount(file.getDailyIncom(), file.getTaxLevel());
		
		nf.setNotificationName("Payment Notification");
		nf.setNotificationDetail("This year tax amount is "+payment);
		
		System.out.println(user.getUserName()+"\nNotification Name :"+nf.getNotificationName());
		System.out.println("Notification Detail :"+nf.getNotificationDetail());
		System.out.println("Paid: "+pay.getIsPaid());
	}

}
