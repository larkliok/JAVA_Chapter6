/**
 * ���ົ Ŭ����
 * @author ������
 *
 */
class SeparateVolume implements Lendable {
	String writer;        //û����ȣ
	String requstNo;      //����
	String bookTitle;     //����
	String borrower;      //������
	String chekOutDate;   //������
	byte state;           //�������
	/**
	 * ���ົ Ŭ���� ������
	 * @param requsrNo : ����
	 * @param bookTitle :û����ȣ
	 * @param writer : ����
	 */
	public SeparateVolume(String requsrNo, String bookTitle, String writer){
		this.requstNo = requsrNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if(state  ==0 ){
			this.borrower = borrower;
			this.chekOutDate = date; 
			this.state = 1;
			
			
		}else{
			System.out.println("������ �Ұ��� �մϴ�.");
		}

	}
	@Override
	public void checkIn() {
		this.borrower = null;
		this.chekOutDate = null;
		this.state = 0;
		System.out.println("*"+bookTitle+"��(��) �ݳ��Ǿ����ϴ�.");
	
	}


}
