package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.oder.Oder;
import hello.core.oder.OderService;
import hello.core.oder.OderServiceImpl;

public class OderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OderService oderService = new OderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        oderService.createOder(memberId, "itemA", 10000);
    }
}
