package heroCamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для создания и изменения команды.
 * пока описание предварительное, мб достаточно засунуть в BaseHero.
 * Предпологается создание команды (списка имён), добавление/удаление участников
 */
public class Team {
    private List<String> team = new ArrayList<>();


    public void inviteToTeam(BaseHero target){
        team.add(target.characterName);
    }

    public void kickFromTeam(BaseHero target){
        team.remove(target.characterName);

    }
}
