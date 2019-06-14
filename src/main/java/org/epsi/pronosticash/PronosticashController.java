package org.epsi.pronosticash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PronosticashController {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String index() {
        return "TEST";
    }


    @RequestMapping(path="/matchs")
    public @ResponseBody
    Iterable<Match> getAllMatchs() {
        String sql = "SELECT * FROM match_table";
        RowMapper<Match> rowMapper = new BeanPropertyRowMapper<Match>(Match.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
