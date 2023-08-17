public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    String getAddress() {
        return address;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws Exception {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст указан неправильно");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws Exception {
        if (name == null || surname == null) {
            throw new IllegalStateException("Пропущены имя или фамилия!");
        } else {
            return new Person(this);
        }
    }
}