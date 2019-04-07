package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BuyBookService {

    static HashMap<String, MemberVo> memberMap = new HashMap<String, MemberVo>();

    public static void execute() {

        MemberVo kaiin1 = memberRegist("佐藤一郎", 15);
        MemberVo kaiin2 = memberRegist("鈴木二郎", 25);
        MemberVo kaiin3 = memberRegist("田中三郎", 35);

        BooksVo book1 = bookRegist("やさしいJava", 300);
        BooksVo book2 = bookRegist("よくわかるC++", 400);
        BooksVo book3 = bookRegist("明解Python", 500);

        List<BooksVo> kaiin1BookList = new ArrayList<BooksVo>();
        List<BooksVo> kaiin2BookList = new ArrayList<BooksVo>();
        List<BooksVo> kaiin3BookList = new ArrayList<BooksVo>();

        Collections.addAll(kaiin1BookList, book1);
        Collections.addAll(kaiin2BookList, book1, book2);
        Collections.addAll(kaiin3BookList, book1, book2, book3);

        buyBook(kaiin1, kaiin1BookList);
        buyBook(kaiin2, kaiin2BookList);
        buyBook(kaiin3, kaiin3BookList);

        memberMap.put("001", kaiin1);
        memberMap.put("002", kaiin2);
        memberMap.put("003", kaiin3);

        showAll(memberMap);

    }

    private static MemberVo memberRegist(String name, int old) {

        MemberVo memberVo = new MemberVo();

        memberVo.setMemberName(name);
        memberVo.setMemberOld(old);

        return memberVo;

    }

    private static BooksVo bookRegist(String name, int pages) {

        BooksVo booksVo = new BooksVo();

        booksVo.setBookName(name);
        booksVo.setBookPages(pages);

        return booksVo;

    }

    private static void buyBook(MemberVo memberVo, List<BooksVo> bookList) {

        memberVo.setMemberHaveBooks(bookList);

    }

    private static void showAll(HashMap<String, MemberVo> memberMap) {

        for (String key : memberMap.keySet()) {

            System.out.println("--------------------");
            System.out.println("[会員番号]：" + key);
            System.out.println("[氏名]：" + memberMap.get(key).getMemberName());
            System.out.println("[年齢]：" + memberMap.get(key).getMemberOld() + "歳");
            System.out.println("[所持している本]↓");

            for (BooksVo memberHaveBooks : memberMap.get(key).getMemberHaveBooks()) {

                System.out.println("・「" + memberHaveBooks.getBookName() + "」 " + memberHaveBooks.getBookPages() + "ページ");

            }

        }

        System.out.println("--------------------");

    }

}
