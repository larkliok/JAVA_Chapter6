/**
 * CD정보 클래스
 * @author 정희정
 *
 */

class CDInfo {
    static String registerNo;   // 관련번호
    String title;        // 타이틀
    /**
     * CD 정보 클래스 생성자
     * @param registerNo : 관련번호
     * @param title : 타이틀
     */
    CDInfo(String registerNo, String title) {
        this.registerNo = registerNo;
        this.title = title;
    }
}
