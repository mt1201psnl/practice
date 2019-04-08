package test;

import java.util.List;

public class MemberVo extends SuperMemberVo {

    //会員の所持している本リスト
    private List<BooksVo> memberHaveBooks;

    MemberVo(String name, int old) {
        super(name, old);
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
