package repository;


import io.mercury.textbasemvp.entity.Artifact;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArtifactTest {

    @Test
    public void createArtifact() {
        Artifact artifact = new Artifact("lol");
        assertEquals("lol", artifact.getValue());
        assertEquals(artifact.getValue(), "lol");
    }

}
