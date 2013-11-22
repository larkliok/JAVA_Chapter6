/**
 * 단행본 클래스
 * @author 정희정
 *
 */
class SeparateVolume implements Lendable {
	String writer;        //청구번호
	String requstNo;      //제목
	String bookTitle;     //저자
	String borrower;      //대출인
	String chekOutDate;   //대출일
	byte state;           //대출상태
	/**
	 * 단행본 클래스 생성자
	 * @param requsrNo : 제목
	 * @param bookTitle :청구번호
	 * @param writer : 저자
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
			System.out.println("대출이 불가능 합니다.");
		}

	}
	@Override
	public void checkIn() {
		this.borrower = null;
		this.chekOutDate = null;
		this.state = 0;
		System.out.println("*"+bookTitle+"이(가) 반납되었습니다.");
	
	}


}
