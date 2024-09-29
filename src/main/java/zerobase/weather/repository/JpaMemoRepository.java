package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

/**
 * DB연동 코드를 만드는 class
 * jpaRepository에는 필요 함수가 저장되어있음.
 * <Memo, Integer>
 * Moemo : 어떤 class, Integer : 키 형식
 * JdbcMemoRepository와 동일한 코드라 볼 수 있음.
 */
@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
}
