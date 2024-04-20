public abstract class BaseAbstract {
    private String surName = "Kowalski";

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public abstract String InfoPerson();
}
