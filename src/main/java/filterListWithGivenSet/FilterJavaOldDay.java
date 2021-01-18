package filterListWithGivenSet;

/**
 * @author Anna S. Almielka
 */

import java.util.List;
import java.util.Set;

/**
 * Sum and return score for persons whose ids are included in an importantIds set
 */

public class FilterJavaOldDay {

    public int sumScore(List<Person> persons, Set<Integer> importantIds) {
        int sum = 0;
        for (Person person : persons) {
            if (importantIds.contains(person.getId())) {
                sum += person.getScore();
            }
        }
        return sum;
    }

}
