package org.derekdaisy.polls.service;

import org.derekdaisy.polls.domain.Poll;
import org.derekdaisy.polls.domain.repository.PollsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollsService {

    @Autowired
    private PollsRepository pollsRepository;

    public List<Poll> getAllPolls() {
        return pollsRepository.findAll();
    }

    public void savePoll(Poll poll) {
        pollsRepository.save(poll);
    }

    public Poll findPollById(Long id) {
        return pollsRepository.findById(id);
    }

    public void deletePollById(Long id) {
        pollsRepository.delete(id);
    }

    public List<Poll> findPollsByNameContains(String name) {
        return pollsRepository.findByNameContains(name);
    }

}
