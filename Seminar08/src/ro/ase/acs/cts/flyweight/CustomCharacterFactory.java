package ro.ase.acs.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, TextCharacter> map = new HashMap<>();

    public TextCharacter getTextCharacter(Character character) {
        if (!map.containsKey(character)) {
            map.put(character, new CustomTextCharacter(character,
                    new byte[]{1, 2}));
        }
        return map.get(character);
    }
}
