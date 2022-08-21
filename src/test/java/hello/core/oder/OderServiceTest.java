package hello.core.oder;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OderService oderService = new OderServiceImpl();

    @Test
    void createOder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Oder oder = oderService.createOder(memberId, "itemA", 10000);
        Assertions.assertThat(oder.getDiscountPrice()).isEqualTo(1000);
    }
}