package controller;

import teams.Member;

import java.util.List;

public class TeamController {
    /**
     * Responsible for team processes
     */
    List<Member> members;

    public void run() {
        members = TeamSetup.get();
    }
}
