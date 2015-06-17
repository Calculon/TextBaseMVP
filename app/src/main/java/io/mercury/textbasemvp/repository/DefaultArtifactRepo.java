package io.mercury.textbasemvp.repository;

import io.mercury.textbasemvp.entity.Artifact;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DefaultArtifactRepo implements ArtifactRepo {

    private final Set<Artifact> artifacts = new HashSet<>();

    public DefaultArtifactRepo(ArtifactSource source) {
        this.artifacts.addAll(source.getArtifacts());
    }

    @Override
    public boolean exists(Artifact item) {
        return artifacts.contains(item);
    }

    @Override
    public Collection<Artifact> getAll() {
        // Actually allows modification...
        return artifacts;
    }

    @Override
    public ArtifactResponse get(ArtifactRequest request) {
        return null;
    }
}
