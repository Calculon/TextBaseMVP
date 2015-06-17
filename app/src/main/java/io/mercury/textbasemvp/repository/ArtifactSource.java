package io.mercury.textbasemvp.repository;

import io.mercury.textbasemvp.entity.Artifact;

import java.util.Collection;

public interface ArtifactSource {
    Collection<Artifact> getArtifacts();
}
