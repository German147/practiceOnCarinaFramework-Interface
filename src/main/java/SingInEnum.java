public enum SingInEnum {

    USER("loginUsername"),
    PASSWORD("loginPassword");

    private final String id;

    SingInEnum(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
