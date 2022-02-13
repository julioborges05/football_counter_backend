package main.Repository;

import main.Entity.MatchStatisticEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchStatisticRepository extends JpaRepository<MatchStatisticEntity, Long> {
}
