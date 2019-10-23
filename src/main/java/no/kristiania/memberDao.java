package no.kristiania;

import javax.sql.DataSource;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class memberDao {
    private List<Member> members = new ArrayListist<>();

    public memberDao(DataSource dataSource) {

    }

    public void insert (Member member) { members.add(Member); }

    public List<Member> listAll() { return members; }



}
