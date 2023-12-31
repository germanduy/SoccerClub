package com.example.eproject4.DTO.Request;

import com.example.eproject4.Entity.Stadium;
import com.example.eproject4.Entity.Team;
import com.example.eproject4.Utils.MapToDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchRequest {
    private Long id;
    private String match_time;
    private Team home_team_id;
    private Team away_team_id;
    private Stadium stadium_id;
    private Integer status;
    private Team team;
    private Stadium stadium;
}
