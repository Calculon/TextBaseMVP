package io.mercury.textbasemvp.repository;


import io.mercury.textbasemvp.entity.Artifact;

import java.util.Collection;

public interface ArtifactRepo {

    boolean exists(Artifact item);

    ArtifactResponse get(ArtifactRequest request);
    Collection<Artifact> getAll();

    class ArtifactRequest {}

    class ArtifactResponse {}

}
