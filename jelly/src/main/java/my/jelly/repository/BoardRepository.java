package my.jelly.repository;

import my.jelly.entity.jBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<jBoard, Long> {

}