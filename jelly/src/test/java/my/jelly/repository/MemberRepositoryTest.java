package my.jelly.repository;

import my.jelly.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    void 테스트회원등록(){
        Member member = new Member();
        IntStream.rangeClosed(1,50).forEach(i->{
            member.setMEmail("test"+i+"@kakao.com");
            member.setMNick("유저"+i);
            member.setMJelly(String.valueOf(Math.random()*5+1));
            memberRepository.save(member);
        });
        System.out.println("회원등록 완료");
    }
}