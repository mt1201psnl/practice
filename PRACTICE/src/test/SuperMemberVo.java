package test;

public class SuperMemberVo {

    private String memberName;
    private int memberOld;

    SuperMemberVo(String name, int old) {

        memberName = name;
        memberOld = old;

    }

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

}
