interface Lendable {
	/**
	 * 
	 * �����Ѵ�.
	 * @param borrower : ������ �̸�
	 * @param date : ���� ��¥
	 */
    abstract void checkOut(String borrower, String date); 
    /**
     * �ݳ��Ѵ�.
     */
    abstract void checkIn(); 
}