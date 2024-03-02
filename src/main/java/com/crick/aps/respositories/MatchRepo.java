package com.crick.aps.respositories;

import com.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //  I want to fetch match
    // I will provide teamHeading

    Optional<Match> findByTeamHeading(String teamHeading);
}
