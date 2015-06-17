package io.mercury.textbasemvp.entity;


public class Artifact {

    private final String value;

    public Artifact(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        // Only care about logical equality
        if (o instanceof Artifact) {
            return value.equals(((Artifact) o).value);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
