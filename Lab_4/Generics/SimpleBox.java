package Lab_4.Generics;

class SimpleBox<ReasonableText> {
    private ReasonableText t;

    public void set(ReasonableText t) {
        this.t = t;
    }

    public ReasonableText get() {
        return t;
    }
}
