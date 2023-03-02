package my.jelly.service;

import my.jelly.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {
    @Autowired
    private BoardService boardService;

    @Test
    void 테스트게시글등록(){
        BoardDTO dto = BoardDTO.builder().build();
    }
}