package c0321g1_gaming.model.entity.game;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class GameType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gameTypeId;
    private String name;
    @OneToMany(mappedBy = "gameType",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Game> gameList;

    public GameType() {
    }

    public GameType(String name, List<Game> gameList) {
        this.name = name;
        this.gameList = gameList;
    }

    public Long getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Long gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }
}
