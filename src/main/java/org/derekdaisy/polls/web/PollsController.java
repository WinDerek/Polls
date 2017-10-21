package org.derekdaisy.polls.web;

import org.derekdaisy.polls.domain.Poll;
import org.derekdaisy.polls.service.PollsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PollsController {

    @Autowired
    private PollsService pollsService;

    @RequestMapping(value = "/polls", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public List<Poll> polls() {
        return pollsService.getAllPolls();
    }

    @RequestMapping(value = "/createPoll/{name}/{description}", method = RequestMethod.POST,
            produces = "application/json;charset=UTF8")
    public Poll createPoll(@PathVariable("name") String name,
                           @PathVariable("description") String description) {
        Poll poll = new Poll();
        poll.setName(name);
        poll.setDescription(description);
        poll.setVotesNum(0);
        pollsService.savePoll(poll);
        return poll;
    }

    @RequestMapping(value = "/votePoll/{id}", method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public Poll votePoll(@PathVariable("id") Long id) {
        Poll poll = pollsService.findPollById(id);
        poll.setVotesNum(poll.getVotesNum() + 1);
        pollsService.savePoll(poll);
        return poll;
    }

    @RequestMapping(value = "/deletePoll/{id}", method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public List<Poll> deletePoll(@PathVariable("id") Long id) {
        pollsService.deletePollById(id);
        return pollsService.getAllPolls();
    }

    @RequestMapping(value = "/searchPolls/{name}", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public List<Poll> searchPolls(@PathVariable("name") String name) {
        return pollsService.findPollsByNameContains(name);
    }

}
