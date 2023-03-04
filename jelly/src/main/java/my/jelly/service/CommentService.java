package my.jelly.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import my.jelly.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
}
