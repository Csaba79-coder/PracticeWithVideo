package utils;

import teams.Member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentReader {
    private static final String FILE_NAME = "src/resources/members.txt";     // konstans

    /**
     * Returns member list from the members.txt resource file
     */
    public static List<Member> loadMembers() {
        try {
            return loadLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Returns a list of lines from file
     * @return
     */
    private static List<Member> loadLines() throws IOException {
        List<Member> members = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            members.add(loadMembersFromLine(line));
        }

        return members;
    }

    private static Member loadMembersFromLine(String line) {
        String[] parts = line.split(",");
        Member member = new Member(parts[0], Integer.parseInt(parts[1]), parts[2]);
        return member;
    }
}
