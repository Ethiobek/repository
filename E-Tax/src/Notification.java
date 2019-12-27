public class Notification extends User {

	private String notificationName;
	private String notificationDetail;

	public String getNotificationName() {
		return this.notificationName;
	}

	public String setNotificationName(String notificationName) {
		return this.notificationName=notificationName;
	}

	public String getNotificationDetail() {
		return this.notificationDetail;
	}

	public String setNotificationDetail(String notificationDetail) {
		return this.notificationDetail=notificationDetail;
	}
}
