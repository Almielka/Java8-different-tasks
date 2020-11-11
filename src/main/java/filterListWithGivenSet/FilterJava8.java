package filterListWithGivenSet;

/**
 * @author Anna S. Almielka
 */

import java.util.List;
import java.util.Set;

/**
 * Sum and return score for persons whose ids are included in an importantIds set
 */

public class FilterJava8 {

    public int sumScore(List<Person> persons, Set<Integer> importantIds) {
        return persons.stream().filter(person -> importantIds.contains(person.getId())).mapToInt(Person::getScore).sum();
    }

}
