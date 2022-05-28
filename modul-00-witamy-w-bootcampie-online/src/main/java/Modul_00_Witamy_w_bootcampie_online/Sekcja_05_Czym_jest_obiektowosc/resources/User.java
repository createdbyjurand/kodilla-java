package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

public class User {

    private int age;
    private String address;
    private String email;
    private String mobile;
    private String name;
    private String sex;
    private String surname;

    public User() {
        System.out.println("User object created");
    }

    public User(String name, String sex) {
        System.out.println("User with parameters object created");
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

    public void displayName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
