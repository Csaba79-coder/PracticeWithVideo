package controller;

import teams.Member;
import utils.DocumentReader;

import java.util.ArrayList;
import java.util.List;

public class TeamSetup {
    /**
     * Returns a list of team members
     * @return
     */
    public static List<Member> get() {
        return DocumentReader.loadMembers();
    }


    /*public static List<Member> get() {
        Member anonymus = new Member();
        Member zsofa = new Member("Zsófa", 19, "Nő");
        Member misi = new Member("Misi", 30, "Férfi");
        Member krisztina = new Member("Krisztina", 19, "Nő");

        *//*List<Member> members = new ArrayList<>() {{
            add(zsofa);
            add(misi);
            add(krisztina);
        }};*//*
        //List<Member> members = loadMembersFromArray(zsofa, misi, krisztina);

        List<Member> members = new ArrayList<>();          // LinkedList ha a csapatok változhatnak
        members.add(zsofa);
        members.add(misi);
        members.add(krisztina);

        return members;
    }

    private static List<Member> loadMembersFromArray(Member... members) {
        List<Member> result = new ArrayList<>();
        for (Member member : members) {
            result.add(member);
        }
        return result;
    }*/
}
