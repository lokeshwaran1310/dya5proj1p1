package com.jdbcconnection.main;

import java.util.ArrayList;
import java.util.List;
import com.jdbcconnection.dao.bugdao;
import com.jdbcconnection.models.bug;

public class Main {
    public static void main(String[] args) {
        bugdao bd = new bugdao();
        bd.insertbug(new bug("Login issue", "Cannot login with credentials", "aaa"));
        bd.insertbug(new bug("abc issue", "aaaabbbb", "bbb"));
        bd.insertbug(new bug("xyz issue", "lllll", "ccc"));
        List<bug> l1=bd.getAllBugs();
        for(bug en:l1){
            System.out.println("ID: " + en.getId());
            System.out.println("Title: " + en.getTitle());
            System.out.println("Description: " + en.getDescription());
            System.out.println("Status: " + en.getStatus());
            System.out.println("---------------------------");
        }

    }
}
