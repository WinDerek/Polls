package org.derekdaisy.polls.domain.repository;

import org.derekdaisy.polls.domain.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PollsRepository extends JpaRepository<Poll, Long> {

    Poll findById(Long id);

    List<Poll> findByNameContains(String name);

}
