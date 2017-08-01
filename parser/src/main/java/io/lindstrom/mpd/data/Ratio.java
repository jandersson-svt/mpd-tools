package io.lindstrom.mpd.data;

import java.util.Objects;

public class Ratio {
    private final Long a;
    private final Long b;

    public Ratio(Long a, Long b) {
        this.a = a;
        this.b = b;
    }

    public Long getA() {
        return a;
    }

    public Long getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Ratio{" + a + ":" + b + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ratio ratio = (Ratio) o;
        return Objects.equals(a, ratio.a) &&
                Objects.equals(b, ratio.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
