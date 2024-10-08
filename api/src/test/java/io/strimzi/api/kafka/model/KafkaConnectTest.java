/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model;

import io.strimzi.test.TestUtils;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The purpose of this test is to ensure:
 *
 * 1. we get a correct tree of POJOs when reading a JSON/YAML `Kafka` resource.
 */
public class KafkaConnectTest extends AbstractCrdTest<KafkaConnect> {

    public KafkaConnectTest() {
        super(KafkaConnect.class);
    }

    @Test
    public void testSpiffeSupport() {
        String resourceName = "KafkaConnect-with-spiffe-support.yaml";
        KafkaConnect model = TestUtils.fromYaml(resourceName, KafkaConnect.class);
        assertThat("The Kafka Connect with Spiffe support should be correctly parsed", model, is(notNullValue()));
    }
}
