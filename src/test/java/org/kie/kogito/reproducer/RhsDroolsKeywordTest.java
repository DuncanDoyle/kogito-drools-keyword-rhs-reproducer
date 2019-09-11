package org.kie.kogito.reproducer;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.jupiter.api.Test;
import org.kie.kogito.reproducer.model.Person;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.impl.SessionMemory;

import io.quarkus.test.junit.QuarkusTest;

/**
 * RhsDroolsKeywordTest
 */
@QuarkusTest
public class RhsDroolsKeywordTest {


    @Inject
    @Named("ruleUnitA")
    private RuleUnit<SessionMemory> ruleUnitA;

    @Test
    public void testRhsDroolsKeyword() {
        Person person = new Person("Duncan", 40);

        SessionMemory sessionMemory = new SessionMemory();
        sessionMemory.add(person);
        ruleUnitA.evaluate(sessionMemory);
    }

}