
public class MessageSenderMain {
	public static void main(String[] args){
		EMailSender obj1 = new EMailSender(
				"������ �����մϴ�",
				"������",
				"admim@kaywon.ac.kr",
				"10% ������ ����Ǿ����ϴ�.");
		SMSSender obj2 = new SMSSender(
				"������ �����մϴ�",
				"������",
				"02-0000-0000",
				"10% ���� ������ ����Ǿ����ϴ�.");
		
		obj1.sendMessage("sootan77@gmail.com");
		obj2.sendMessage("011-709-2255");


	}

}
