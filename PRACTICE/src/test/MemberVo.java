package test;

import java.util.List;

public class MemberVo {

    //会員氏名
    private String memberName;
    //会員年齢
    private int memberOld;
    //会員の所持している本リスト
    private List<BooksVo> memberHaveBooks;

    //会員氏名を取得するgetter
    public String getMemberName() {
        return memberName;
    }

    //会員氏名を設定するsetter
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    //会員年齢を取得するgetter
    public int getMemberOld() {
        return memberOld;
    }

    //会員年齢を設定するsetter
    public void setMemberOld(int memberOld) {
        this.memberOld = memberOld;
    }

    //本リストを取得するgetter
    public List<BooksVo> getMemberHaveBooks() {
        return memberHaveBooks;
    }

    //本リストを設定するsetter
    public void setMemberHaveBooks(List<BooksVo> memberHaveBooks) {
        this.memberHaveBooks = memberHaveBooks;
    }

}
