package entity;

public class Human {
    private int age;
    private String name;
    private boolean status;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else {
            System.out.println("Ошибка! Возраст должен быть больше нуля.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else {
            System.out.println("Ошибка! Необходимо указать имя.");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
